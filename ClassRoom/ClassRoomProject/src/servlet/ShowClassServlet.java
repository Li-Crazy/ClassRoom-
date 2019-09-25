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
import domain.Class;
import domain.Course;
import domain.Teacher;

public class ShowClassServlet extends HttpServlet {
	private Web web;

	/**
	 * Constructor of the object.
	 */
	public ShowClassServlet() {
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
		
		String action = request.getParameter("class");
		String ID = request.getParameter("classid");
		if (action==null&&ID!=null){
			Class cls =  null;
			try {
				cls = web.getClass(ID);

			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("cls",cls);
			RequestDispatcher rd = request.getRequestDispatcher("../table/class.jsp");
			rd.forward(request, response);
		}
		if (action.equals("add")) {
			addClass(request);
			selectClass(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/class.jsp");
			rd.forward(request, response);
		}
		if (action.equals("delete")) {
			deleteClass(request);
			selectClass(request);

			RequestDispatcher rd = request.getRequestDispatcher("../table/class.jsp");
			rd.forward(request, response);
		}
		if (action.equals("update")) {
			updateClass(request);
			selectClass(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/class.jsp");
			rd.forward(request, response);
		}	

	}
	public void addClass(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Class cls = (Class)session.getAttribute("class");

		String ID = request.getParameter("classid");
		String ClassrName = request.getParameter("classname");
		String Amount = request.getParameter("amount");
		String Major = request.getParameter("major");
		String Department = request.getParameter("department");

		try {

			cls = web.addClass(ID, ClassrName, Amount, Major, Department);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classid", ID);
	}
	public void selectClass(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Class cls = (Class)session.getAttribute("class");
		if (cls == null) {
			cls = new Class();
		}

		String ID = request.getParameter("classid");

		try {
			cls = web.getClass(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("cls",cls);

	}

	public void updateClass(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Class cls = (Class)session.getAttribute("class");

		String ID = request.getParameter("classid");
		String ClassrName = request.getParameter("classname");
		String Amount = request.getParameter("amount");
		String Major = request.getParameter("major");
		String Department = request.getParameter("department");

		try {

			cls = web.updateClass(ID, ClassrName, Amount, Major, Department);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classid", ID);
	}

	public void deleteClass(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Class cls = (Class)session.getAttribute("class");

		String ID = request.getParameter("classid");
		try {

			cls = web.deleteClass(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("classid", ID);
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
