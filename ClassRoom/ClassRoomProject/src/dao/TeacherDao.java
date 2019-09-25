package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Teacher;

public class TeacherDao extends BaseDao {
	public List<Teacher> select(String sql) throws Exception {
		List<Teacher> result = new ArrayList<Teacher>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Teacher t = new Teacher();
			t.setTeacherid(rs.getString("teacherID"));
			t.setTeachername(rs.getString("teacherName"));
			t.setPassword(rs.getString("password"));
			t.setDepartment(rs.getString("department"));
			result.add(t);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Teacher addTeacher(String TeacherID,String Password,String Department,String TeacherName) throws Exception{
		Teacher teacher = new Teacher();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="INSERT INTO teacher values('"+TeacherID+"','"+Password+"','"+TeacherName+"','" +Department+"')";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Teacher updateTeacher(String TeacherID,String Password,String Department,String TeacherName) throws Exception{
		Teacher teacher = new Teacher();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="UPDATE teacher set teacherName='"+TeacherName+"',password='"+Password+"',department='"+Department+"' where teacherID='" + TeacherID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Teacher deleteTeacher(String TeacherID) throws Exception{
		Teacher teacher = new Teacher();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from teacher where teacherID='"+TeacherID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		 //从obj属性得到需要的数据 
		ps.executeUpdate();
		ps.close();
		conn.close();   
		return null;
}
	
	public Teacher getTeacher(String TeacherID) throws Exception {
		Teacher t = null;
		List<Teacher> list = select("select * from teacher where teacherID='" + TeacherID
				+ "'");
		if (list != null&&!list.isEmpty())
			t = (Teacher) list.get(0);
		return t;
	}
	
	public List<Teacher> getAllTeacher() throws Exception{
		List<Teacher> list=select("select * from teacher");
		return list;
	}

}
