package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Class;

public class ClassDao extends BaseDao {
	public List<Class> select(String sql) throws Exception {
		List<Class> result = new ArrayList<Class>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在Category对象的属性中
			Class c = new Class();
			c.setClassid(rs.getString("classID"));
			c.setClassname(rs.getString("className"));
			c.setAmount(rs.getString("amount"));
			c.setMajor(rs.getString("major"));
			c.setDepartment(rs.getString("department"));
			result.add(c);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Class addClass(String classID,String className,String amount,String major,String department) throws Exception{
		Class cls = new Class();
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO class values('"+classID+"','"+className+"','"+amount+"','"+major+"','"+department+"')";
		conn = getConnection();
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
	
	}
	
	public Class updateClass(String classID,String className,String amount,String major,String department) throws Exception{
		Class cls = new Class();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="UPDATE class set className='"+className+"',amount='"+amount+"',department='"+department+"',major='"+major+"' where classID='"+classID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
     }
	
	public Class deleteClass(String classID) throws Exception{
		Class cls = new Class();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from class where classID='"+classID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;   	
}
	
	public Class getClass(String ClassID) throws Exception {
		Class c = null;
		List<Class> list = select("select * from class where classID='" + ClassID
				+ "'");
		if (list != null&&!list.isEmpty())
			c = (Class) list.get(0);
		return c;
	}
	
	public List<Class> getAllClass() throws Exception {
		List<Class> list=select("select * from class");
		return list;
	}
	

}
