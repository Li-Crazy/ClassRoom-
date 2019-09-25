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
import domain.Schedule;

public class ShowScheduleBySchoolTimeAServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowScheduleBySchoolTimeAServlet() {
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
		String schooltime = request.getParameter("schooltime");

		List<Schedule> schedule=null;
		List<Classroom> classroom = null;

		try {
			schedule = web.getScheduleBySchooltime(schooltime);
			 classroom = web.getClassroomBySchoolTime(schooltime);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("schedule7",schedule);
		session.setAttribute("classroom1",classroom);

		RequestDispatcher rd1=request.getRequestDispatcher("../login/admin_detail.jsp");
		rd1.forward(request, response);	
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
