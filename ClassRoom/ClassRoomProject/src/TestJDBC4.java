

import java.sql.*;

public class TestJDBC4 {

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
							+ "useUnicode=true&characterEncoding=UTf-8",
					"webapp", "1234");
			// ����(3)������������pstmtִ�в�ѯ
			PreparedStatement pstmt = conn
					.prepareStatement("update teacher set teacherName='����' where teacherid=?");
			pstmt.setInt(1, 2);// ���õ�һ���ʺ�λ�õ�ֵ
//			pstmt.setInt(2, 20000);
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
