package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Web;
import business.WebImpl;
import domain.Classroom;
import domain.Course;
import domain.Teacher;

public class ShowClassroomServlet extends HttpServlet {
	private Web web;
	/**
	 * Constructor of the object.
	 */
	public ShowClassroomServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session=request.getSession();
		web=(Web) session.getAttribute("webproject");
		if(web==null) {
			web=new WebImpl();
            session.setAttribute("web", web);
		}
		
		String action = request.getParameter("classroom");
		String ID = request.getParameter("classroomid");
		if (action==null&&ID!=null){
			Classroom classroom =  null;
			try {
				classroom = web.getClassroom(ID);

			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("classroom",classroom);
			RequestDispatcher rd = request.getRequestDispatcher("../table/classroom.jsp");
			rd.forward(request, response);
		}
		if (action.equals("add")) {
			addClassroom(request);
			selectClassroom(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/classroom.jsp");
			rd.forward(request, response);
		}
		if (action.equals("delete")) {
			deleteClassroom(request);
			selectClassroom(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/classroom.jsp");
			rd.forward(request, response);
		}
		if (action.equals("update")) {

			updateClassroom(request);
			selectClassroom(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/classroom.jsp");
			rd.forward(request, response);
		}	

	}
	public void addClassroom(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Classroom classroom = (Classroom)session.getAttribute("classroom");

		String ID = request.getParameter("classroomid");
		String Amount = request.getParameter("amount");
		String Multimedia = request.getParameter("multimedia");

		try {

			classroom = web.addClassroom(ID, Amount, Multimedia);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classroomid", ID);
	}
	public void selectClassroom(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Classroom classroom = (Classroom)session.getAttribute("classroom");
		if (classroom == null) {
			classroom = new Classroom();
		}

		String ID = request.getParameter("classroomid");

		try {
			classroom = web.getClassroom(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classroom",classroom);

	}

	public void updateClassroom(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Classroom classroom = (Classroom)session.getAttribute("classroom");

		String ID = request.getParameter("classroomid");
		String Amount = request.getParameter("amount");
		String Multimedia = request.getParameter("multimedia");

		try {

			classroom = web.updateClassroom(ID, Amount, Multimedia);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classroomid", ID);
	}

	public void deleteClassroom(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Classroom classroom = (Classroom)session.getAttribute("classroom");

		String ID = request.getParameter("classroomid");
		try {

			classroom = web.deleteClassroom(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classroomid", ID);
	}


	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
