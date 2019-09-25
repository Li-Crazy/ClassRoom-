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

import domain.Application;

import business.Web;
import business.WebImpl;

public class ShowApplicationServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowApplicationServlet() {
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
		Web web=(Web) session.getAttribute("webproject");
		if(web==null) {
			web=new WebImpl();
            session.setAttribute("web", web);
		}

		Application application = null;
		Application apl = null;
		String TeacherID = request.getParameter("teacherid");
		String CourseID = request.getParameter("courseid");
		String SchoolTime = request.getParameter("schooltime");
		String NewSchoolTime = request.getParameter("newschooltime");
		String Classroom = request.getParameter("classroom");
		String NewClassroom = request.getParameter("newclassroom");

		try {
			application = web.addApplication(TeacherID, CourseID, Classroom, NewClassroom, SchoolTime, NewSchoolTime);
			apl = web.getApplication(TeacherID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("application",apl);
		RequestDispatcher rd=request.getRequestDispatcher("../table/application.jsp");
		rd.forward(request, response);
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
