package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Classroom;

public class ClassroomDao extends BaseDao {
	public List<Classroom> select(String sql) throws Exception {
		List<Classroom> result = new ArrayList<Classroom>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Classroom c = new Classroom();
			c.setClassroomid(rs.getString("classroomid"));
			c.setAmount(rs.getString("amount"));
			c.setMultimedia(rs.getString("multimedia"));
			result.add(c);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Classroom addClassroom(String classroomID, String amount,String multimedia) throws Exception{
		Classroom classroom = new Classroom();
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO classroom values('"+classroomID+"','"+amount+"','"+multimedia+"')";
		conn = getConnection();
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
	
	}
	
	public Classroom updateClassroom(String classroomID, String amount,String multimedia) throws Exception{
		Classroom classroom = new Classroom();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="UPDATE classroom set amount='"+amount+"',multimedia='"+multimedia+"' where classroomID='"+classroomID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Classroom deleteClassroom(String classroomID) throws Exception{
		Classroom classroom = new Classroom();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from classroom where classroomID='"+classroomID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;   	
}
	
	public Classroom getClassroom(String ClassroomID) throws Exception {
		Classroom c = null;
		List<Classroom> list = select("select * from classroom where classroomid='" + ClassroomID
				+ "'");
		if (list != null&&!list.isEmpty())
			c = (Classroom) list.get(0);
		return c;
	}
	
	public List<Classroom> getAllClassroom() throws Exception {
		List<Classroom> list=select("select * from classroom");
		return list;
	}
	
	public List<Classroom> getClassroomBySchoolTime(String SchoolTime) throws Exception {
		List<Classroom> list2 = select("select * from classroom where classroomid not in (select classroomid from schedule where SchoolTime='"+SchoolTime+ "')");
		return list2;
	}

}
