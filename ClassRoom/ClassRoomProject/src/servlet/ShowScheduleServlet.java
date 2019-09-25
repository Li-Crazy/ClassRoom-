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
import domain.*;
import domain.Class;

public class ShowScheduleServlet extends HttpServlet {
	
	private Web web;

	/**
	 * Constructor of the object.
	 */
	public ShowScheduleServlet() {
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
		
		String action = request.getParameter("schedule");
		String ID = request.getParameter("scheduleid");
		if (action==null&&ID!=null){
			Schedule schedule =  null;
			try {
				schedule = web.getSchedule(ID);

			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("schedule",schedule);
			RequestDispatcher rd = request.getRequestDispatcher("../table/schedule.jsp");
			rd.forward(request, response);
		}
		if (action.equals("add")) {
			addSchedule(request);
			selectSchedule(request);
			RequestDispatcher rd = request.getRequestDispatcher("../table/schedule.jsp");
			rd.forward(request, response);
		}
		if (action.equals("delete")) {
			deleteSchedule(request);
			selectSchedule(request);

			RequestDispatcher rd = request.getRequestDispatcher("../table/schedule.jsp");
			rd.forward(request, response);
		}
		if (action.equals("update")) {

			updateSchedule(request);
			selectSchedule(request);

			RequestDispatcher rd = request.getRequestDispatcher("../table/schedule.jsp");
			rd.forward(request, response);
		}
		
	}
	public void selectSchedule(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Schedule schedule = (Schedule)session.getAttribute("schedule");
		if (schedule == null) {
			schedule = new Schedule();
		}
		
		String ID = request.getParameter("scheduleid");

		try {
			schedule = web.getSchedule(ID);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("schedule",schedule);
	
	}
	
	public void updateSchedule(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Schedule schedule = (Schedule)session.getAttribute("schedule");
		
		String ID = request.getParameter("scheduleid");
		String TeacherID = request.getParameter("teacherid");
		String CourseID = request.getParameter("courseid");
		String ClassroomID = request.getParameter("classroomid");
		String ClassID = request.getParameter("classid");
		String Schooltime = request.getParameter("schooltime");

		try {
			
			schedule = web.updateSchedule(ID, CourseID, ClassroomID, ClassID, TeacherID, Schooltime);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("scheduleid", ID);
//		selectSchedule(request);
	}
	
	public void deleteSchedule(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Schedule schedule = (Schedule)session.getAttribute("schedule");
		
		String ID = request.getParameter("scheduleid");
		try {
			
			schedule = web.deleteSchedule(ID);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("scheduleid", ID);
//		selectSchedule(request);
	}

	public void addSchedule(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Schedule schedule = (Schedule)session.getAttribute("schedule");
		
		String ID = request.getParameter("scheduleid");
		String TeacherID = request.getParameter("teacherid");
		String CourseID = request.getParameter("courseid");
		String ClassroomID = request.getParameter("classroomid");
		String ClassID = request.getParameter("classid");
		String Schooltime = request.getParameter("schooltime");


		try {
			
			schedule = web.addSchedule(ID, CourseID, ClassroomID, ClassID, TeacherID, Schooltime);

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("scheduleid", ID);
//		selectSchedule(request);
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
