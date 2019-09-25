

import java.sql.*;

public class TestJDBC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

		try {
			// ����(1)��ע��MySQL��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/webproject?"
							+ "useUnicode=true&characterEncoding=GBK",
					"webapp", "1234");
			// ����(3)������������pstmtִ�в�ѯ
			PreparedStatement pstmt = conn
					.prepareStatement("delete from  admin  where adminid=?");
			pstmt.setString(1, "004");// ���õ�һ���ʺ�λ�õ�ֵ
			// ����(4)��ʹ��������stmtִ�в�ѯ
			int rows = pstmt.executeUpdate();

			System.out.println(rows);
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
