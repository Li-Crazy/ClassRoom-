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
import domain.Student;

public class ShowStudentServlet extends HttpServlet {

	private Web web;

	/**
	 * Constructor of the object.
	 */
	public ShowStudentServlet() {
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
	 * This method is called when a form  has its tag value method equals to get.
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

		String action = request.getParameter("student");
		String ID = request.getParameter("studentid");
		if (action==null&&ID!=null){
			Student student =  null;
			try {
				student = web.getStudent(ID);

			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("student",student);
			RequestDispatcher rd = request.getRequestDispatcher("../table/student.jsp");
			rd.forward(request, response);
		}
		if (action.equals("add")) {
			addStudent(request);
			selectStudent(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/student.jsp");
			rd.forward(request, response);
		}
		if (action.equals("delete")) {
			deleteStudent(request);
			selectStudent(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/student.jsp");
			rd.forward(request, response);
		}
		if (action.equals("update")) {
			updateStudent(request);
			selectStudent(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/student.jsp");
			rd.forward(request, response);
		}

	}
	public void selectStudent(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Student student = (Student)session.getAttribute("student");
		if (student == null) {
			student = new Student();
		}

		String ID = request.getParameter("studentid");

		try {
			student = web.getStudent(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("student",student);

	}
	//	
	public void updateStudent(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Student student = (Student)session.getAttribute("student");

		String ID = request.getParameter("studentid");
		String StudentName = request.getParameter("studentname");
		String Password = request.getParameter("password");
		String Department = request.getParameter("department");

		try {

			student = web.updateStudent(ID, Password, Department, StudentName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("studentid", ID);
		//		selectTeacher(request);
	}

	public void deleteStudent(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Student student = (Student)session.getAttribute("student");

		String ID = request.getParameter("studentid");
		try {

			student = web.deleteStudent(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("studentid", ID);
		//		selectTeacher(request);
	}

	public void addStudent(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Student student = (Student)session.getAttribute("student");

		String ID = request.getParameter("studentid");
		String StudentName = request.getParameter("studentname");
		String Password = request.getParameter("password");
		String Department = request.getParameter("department");

		try {

			student = web.addStudent(ID, Password, Department, StudentName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("studentid", ID);
		//		selectStudent(request);
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
