package _2019_12_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbdDeleteDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브로드 성공!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null; // 닫을 목적으로 밖에 선언 디비연결하기위해 커넥션객체가필요해!
		PreparedStatement pstmt = null;// sql문 전송용도 의 프리페어런트 스테이트먼트 객체 필요해 머든
										// 페키지는 자바.SQL패키지.

		try {
			con = DriverManager.getConnection(
					// 데이터 베이스와 연결을 시도하는것
					"jdbc:mysql://localhost/acorn?autoReconnect=true", // url
																		// ,3306이포트면
																		// 안써도
																		// 무방
					"acorn12", // user
					"acorn12"// password

			);

			System.out.println("데이터 베이스에 연결을 성공했어요.");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM dept "); // 항상 한칸 을 띄우자.
			sql.append("WHERE deptno =? ");
			pstmt = con.prepareStatement(sql.toString());
			// 바인딩 변수 를 설정한다.
			pstmt.setString(1, "60");

			int result = pstmt.executeUpdate();// dml문 인 insert,update,delete를
												// 실핼 할때 executeUpdate 사용.
			// 여기서 result는 갠신된행의 수이다. dml이 갱신된행의 수를 반환하기때문.
			System.out.println("삭제된 행의 수 : " + result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			{
				try {
					if (pstmt != null) {
						pstmt.close();
					}
					if (con != null) {
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
