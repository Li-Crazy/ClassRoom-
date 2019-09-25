

import java.sql.*;

public class TestJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webproject?"
							+ "useUnicode=true&characterEncoding=UTF-8",
					"webapp", "1234");
			PreparedStatement pstmt = conn
					.prepareStatement("select * from  admin");
//			pstmt.setString(1, "003");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("AdminID:" + rs.getString("AdminID"));
				System.out.println("AdminName:" + rs.getString("AdminName"));
				System.out.println("Password:" + rs.getString("Password"));

			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
