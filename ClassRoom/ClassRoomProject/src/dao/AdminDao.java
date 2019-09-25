package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Admin;

public class AdminDao extends BaseDao {
	public List<Admin> select(String sql) throws Exception {
		List<Admin> result = new ArrayList<Admin>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		conn = getConnection();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			// 查询得到的数据都保存在对象的属性中
			Admin a = new Admin();
			a.setAdminid(rs.getString("adminID"));
			a.setAdminname(rs.getString("adminName"));
			a.setPassword(rs.getString("password"));
			result.add(a);
		}
		conn.close();
		stmt.close();
		rs.close();
		return result;
	}

	public Admin addAdmin(String adminID,String password,String adminName) throws Exception{
		Admin admin = new Admin();
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO admin values('"+adminID+"','"+password+"','"+adminName+"')";
		conn = getConnection();
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;
	
	}
	
	public Admin updateAdmin(String adminID,String password,String adminName) throws Exception{
		Admin admin = new Admin();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="UPDATE admin set adminName='"+adminName+"',password='"+password+"' where adminID='"+adminID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		return null;

     }
	
	public Admin deleteAdmin(String adminID) throws Exception{
		Admin admin = new Admin();
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="DELETE from admin where adminID='"+adminID+"'";
		conn=getConnection();
		ps=conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();   	
		return null;

}
	
	public Admin getAdmin(String AdminID) throws Exception {
		Admin a = null;
		List<Admin> list = select("select * from admin where adminid='" + AdminID
				+ "'");
		if (list != null&&!list.isEmpty())
			a = (Admin) list.get(0);
		return a;
	}
	
	public List<Admin> getAllAdmin() throws Exception{
		List<Admin> list=select("select * from admin");
		return list;
	}

}
