package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import domain.Admin;
import domain.Student;
import domain.Teacher;

import business.Web;
import business.WebImpl;;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		Web web=(Web) session.getAttribute("webproject");
		if(web==null) {
			web=new WebImpl();
			session.setAttribute("web", web);
		}

		String radio=request.getParameter("user");
		//		PrintWriter out=response.getWriter();
		//		out.println("<html><head><title>Front page of Ex37</title><body>");
		//		out.println("This is the Sub Page of Ex37"+"<br>");
		//		out.println(""+"<br>");
		//		out.println("×îÏ²»¶µÄ¿Î³ÌÊÇ:"+radio+"<br>");
		//		out.println("</body></html>");
		//		out.close();

		if (radio!=null&&radio.equals("student")){
			String ID=request.getParameter("name");
			String password1=request.getParameter("password1");
			Student student=null;
			try {
				student = web.getStudent(ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(student!=null&&student.getPassword().equals(password1)){
				session.setAttribute("student", student);
				session.setAttribute("info1", "Í¬Ñ§»¶Ó­Äã");
				response.setHeader("Pragma","No-cache");
				response.setHeader("Cache-Control","no-cache");
				response.setHeader("Cache-Control", "no-store");
				response.setDateHeader("Expires", 0);
				response.sendRedirect("../login/student_detail.jsp");



			}else{
				session.setAttribute("info", "µÇÂ¼Ê§°Ü");
				response.sendRedirect("../Main.jsp");
			}

		}
		else if (radio!=null&&radio.equals("teacher")){
			String ID=request.getParameter("name");
			String password1=request.getParameter("password1");
			Teacher teacher=null;
			try {
				teacher = web.getTeacher(ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(teacher!=null&&teacher.getPassword().equals(password1)){
				session.setAttribute("teacher", teacher);
				session.setAttribute("info1", "ÀÏÊ¦»¶Ó­Äú");
				response.setHeader("Pragma","No-cache");
				response.setHeader("Cache-Control","no-cache");
				response.setHeader("Cache-Control", "no-store");
				response.setDateHeader("Expires", 0);
				response.sendRedirect("../login/teacher_detail.jsp");

			}else{
				session.setAttribute("info", "µÇÂ¼Ê§°Ü");
				response.sendRedirect("../Main.jsp");
			}

		}
		else if (radio!=null&&radio.equals("admin")){
			String ID=request.getParameter("name");
			String password1=request.getParameter("password1");
			Admin ad=null;
			try {
				ad = web.getAdmin(ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(ad!=null&&ad.getPassword().equals(password1)){
				session.setAttribute("ad", ad);
				session.setAttribute("info1", "¹ÜÀíÔ±»¶Ó­Äú");			

				response.setHeader("Pragma","No-cache");
				response.setHeader("Cache-Control","no-cache");
				response.setHeader("Cache-Control", "no-store");
				response.setDateHeader("Expires", 0);
				response.sendRedirect("../login/admin_detail.jsp");

			}else{
				session.setAttribute("info", "µÇÂ¼Ê§°Ü");
				response.sendRedirect("../Main.jsp");
			}

		}


	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
