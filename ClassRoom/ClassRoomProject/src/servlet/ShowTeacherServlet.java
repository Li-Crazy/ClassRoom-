package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Web;
import business.WebImpl;

import domain.Course;
import domain.Teacher;

public class ShowTeacherServlet extends HttpServlet {

	private Web web;

	/**
	 * Constructor of the object.
	 */
	public ShowTeacherServlet() {
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
		
		
		String action = request.getParameter("teacher");
		String ID = request.getParameter("teacherid");
		if (action==null&&ID!=null){
			Teacher teacher =  null;
			try {
				teacher = web.getTeacher(ID);

			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("teacher",teacher);
			RequestDispatcher rd = request.getRequestDispatcher("../table/teacher.jsp");
			rd.forward(request, response);
		}
		if (action.equals("add")) {
			addTeacher(request);
			selectTeacher(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/teacher.jsp");
			rd.forward(request, response);
		}
		if (action.equals("delete")) {
			deleteTeacher(request);
			selectTeacher(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/teacher.jsp");
			rd.forward(request, response);
		}
		if (action.equals("update")) {

			updateTeacher(request);
			selectTeacher(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/teacher.jsp");
			rd.forward(request, response);
		}
	}

	public void selectTeacher(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		if (teacher == null) {
			teacher = new Teacher();
		}
		
		String ID = request.getParameter("teacherid");

		try {
			teacher = web.getTeacher(ID);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("teacher",teacher);	
	}
	
	public void updateTeacher(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		
		String ID = request.getParameter("teacherid");
		String TeacherName = request.getParameter("teachername");
		String Password = request.getParameter("password");
		String Department = request.getParameter("department");

		try {
			
			teacher = web.updateTeacher(ID, Password, Department, TeacherName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("teacherid", ID);
//		selectTeacher(request);
	}
	
	public void deleteTeacher(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		
		String ID = request.getParameter("teacherid");
		try {
			
			teacher = web.deleteTeacher(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("teacherid", ID);
//		selectTeacher(request);
	}

	public void addTeacher(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		
		String ID = request.getParameter("teacherid");
		String TeacherName = request.getParameter("teachername");
		String Password = request.getParameter("password");
		String Department = request.getParameter("department");

		try {
			
			teacher = web.addTeacher(ID, Password, Department, TeacherName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("teacherid", ID);
//		selectTeacher(request);
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
