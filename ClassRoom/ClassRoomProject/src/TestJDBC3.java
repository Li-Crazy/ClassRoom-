

import java.sql.*;

public class TestJDBC3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

		try {
			// ����(1)��ע��MySQL��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			/* ����(2)�����û�petstoreapp����123������petstore������ */
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/webproject?"
							+ "useUnicode=true&characterEncoding=GBK",
					"webapp", "1234");
			// ����(3)������������pstmtִ�в�ѯ
			PreparedStatement pstmt = conn
					.prepareStatement("insert into admin values(?,?,?)");
			pstmt.setString(1, "004");// ���õ�һ���ʺ�λ�õ�ֵ
			pstmt.setString(3, "��");
			pstmt.setString(2, "122");

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
