package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Course;

public class CourseDao extends BaseDao {
	public List<Course> select(String sql) throws Exception {
		List<Course> result = new ArrayList<Course>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Course c = new Course();
			c.setCourseid(rs.getString("courseID"));
			c.setCoursename(rs.getString("courseName"));
			c.setTeacherid(rs.getString("teacherID"));
			result.add(c);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Course addCourse(String CourseID,String CourseName,String TeacherID) throws Exception{
		Course course = new Course();
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO course values('"+CourseID+"','"+CourseName+"','"+TeacherID+"')";
		conn = getConnection();
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
	
	}
	
	public Course updateCourse(String CourseID,String CourseName,String TeacherID) throws Exception{
		Course course = new Course();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="UPDATE course set courseName='"+CourseName+"',teacherID='"+TeacherID+"' where courseID='"+CourseID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Course deleteCourse(String CourseID) throws Exception{
		Course course = new Course();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from course where courseID='"+CourseID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;   	
}
	
	public Course getCourse(String CourseID) throws Exception {
		Course c = null;
		List<Course> list = select("select * from course where courseID='" + CourseID
				+ "'");
		if (list != null&&!list.isEmpty())
			c = (Course) list.get(0);
		return c;
	}
	
	public List<Course> getAllCourse() throws Exception {
		List<Course> list=select("select * from course");
		return list;
	}


}
