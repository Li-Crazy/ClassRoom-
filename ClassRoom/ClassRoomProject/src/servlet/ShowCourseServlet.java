package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Web;
import business.WebImpl;
import domain.Course;
import domain.Teacher;

public class ShowCourseServlet extends HttpServlet {
	private Web web;

	/**
	 * Constructor of the object.
	 */
	public ShowCourseServlet() {
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

		String action = request.getParameter("course");
		String ID = request.getParameter("courseid");
		if (action==null&&ID!=null){
			Course course =  null;
			try {
				course = web.getCourse(ID);

			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("course",course);
			RequestDispatcher rd = request.getRequestDispatcher("../table/course.jsp");
			rd.forward(request, response);
		}
		if (action.equals("add")) {
			addCourse(request);
			selectCourse(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/course.jsp");
			rd.forward(request, response);
		}
		if (action.equals("delete")) {
			deleteCourse(request);
			selectCourse(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/course.jsp");
			rd.forward(request, response);
		}
		if (action.equals("update")) {
			updateCourse(request);
			selectCourse(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/course.jsp");
			rd.forward(request, response);
		}	

	}
	public void addCourse(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Course course = (Course)session.getAttribute("course");

		String ID = request.getParameter("courseid");
		String TeacherID = request.getParameter("teacherid");
		String Coursename = request.getParameter("coursename");

		try {

			course = web.addCourse(ID, Coursename, TeacherID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("courseid", ID);
//		selectCourse(request);
	}
	public void selectCourse(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Course course = (Course)session.getAttribute("course");
		if (course == null) {
			course = new Course();
		}

		String ID = request.getParameter("courseid");

		try {
			course = web.getCourse(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("course",course);

	}

	public void updateCourse(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Course course = (Course)session.getAttribute("course");

		String ID = request.getParameter("courseid");
		String TeacherID = request.getParameter("teacherid");
		String Coursename = request.getParameter("coursename");

		try {

			course = web.updateCourse(ID, Coursename, TeacherID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("courseid", ID);
	}

	public void deleteCourse(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Course course = (Course)session.getAttribute("course");

		String ID = request.getParameter("courseid");
		try {

			course = web.deleteCourse(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("courseid", ID);
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
