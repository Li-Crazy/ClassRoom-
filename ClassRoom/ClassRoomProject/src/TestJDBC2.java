

import java.sql.*;

public class TestJDBC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

		try {
			// 步骤(1)，注册MySQL驱动程序
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/webproject?"
							+ "useUnicode=true&characterEncoding=GBK",
					"webapp", "1234");
			// 步骤(3)，创建语句对象pstmt执行查询
			PreparedStatement pstmt = conn
					.prepareStatement("delete from  admin  where adminid=?");
			pstmt.setString(1, "004");// 设置第一个问号位置的值
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
