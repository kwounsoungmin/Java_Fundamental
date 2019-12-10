package _2019_12_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null; // 닫을 목적으로 밖에 선언
		PreparedStatement pstmt = null;// sql문 전송용도
		ResultSet rs = null; // 커서맨위로 ResultSet

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12"// password
			);
			System.out.println("데이터 베이스에 연결을 성공했어요.");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT DEPTNO , DNAME, LOC ");
			sql.append("FROM DEPT ");
			sql.append("ORDER BY DEPTNO ");

			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery(); // select 문일때 전송하는메소드
			
			while (rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.printf("%d,%s, %s%n", deptno, dname, loc);
			}

			/*
			 * while(rs.next()){ int index =0; int dept=rs.getInt(++indext);
			 * string dname=rs.getInt(++indext); 이런식으로 해야 100개가되도 할 수 있다.
			 */

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
