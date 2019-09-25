

import java.sql.*;

public class TestJDBC4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

		try {
			// 步骤(1)，注册MySQL驱动程序
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			/* 步骤(2)，以用户petstoreapp密码123创建与petstore的连接 */
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/webproject?"
							+ "useUnicode=true&characterEncoding=UTf-8",
					"webapp", "1234");
			// 步骤(3)，创建语句对象pstmt执行查询
			PreparedStatement pstmt = conn
					.prepareStatement("update teacher set teacherName='刘飞' where teacherid=?");
			pstmt.setInt(1, 2);// 设置第一个问号位置的值
//			pstmt.setInt(2, 20000);
			// 步骤(4)，使用语句对象stmt执行查询
			int rows = pstmt.executeUpdate();

			System.out.println(rows);
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
