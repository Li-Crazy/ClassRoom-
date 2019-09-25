package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Student;

public class StudentDao extends BaseDao {
	public List<Student> select(String sql) throws Exception {
		List<Student> result = new ArrayList<Student>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Student s = new Student();
			s.setStudentid(rs.getString("studentid"));
			s.setStudentname(rs.getString("studentname"));
			s.setPassword(rs.getString("password"));
			s.setDepartment(rs.getString("department"));
			result.add(s);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Student addStudent(String StudentID,String Password,String Department,String StudentName) throws Exception{
		Student student = new Student();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="INSERT INTO student values('"+StudentID+"','"+Password+"','"+StudentName+"','" +Department+"')";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Student updateStudent(String StudentID,String Password,String Department,String StudentName) throws Exception{
		Student Student = new Student();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="UPDATE student set studentName='"+StudentName+"',password='"+Password+"',department='"+Department+"' where studentID='" + StudentID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Student deleteStudent(String StudentID) throws Exception{
		Student student = new Student();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from student where studentID='"+StudentID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();   
		return null;
}
	
	public Student getStudent(String StudentID) throws Exception {
		Student s = null;
		List<Student> list = select("select * from student where studentID='" + StudentID
				+ "'");
		if (list != null&&!list.isEmpty())
			s = (Student) list.get(0);
		return s;
	}
	
	public List<Student> getAllStudent() throws Exception{
		List<Student> list=select("select * from student");
		return list;
	}

}
