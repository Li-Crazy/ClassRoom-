package dao;

import java.sql.*;

public class BaseDao {
	private String driverName = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/webproject?useUnicode=true&characterEncoding=UTF-8";
	private String user = "webapp";
	private String password = "1234";

	public Connection getConnection() throws Exception {
		Connection conn = null;
		Class.forName(driverName).newInstance();
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
