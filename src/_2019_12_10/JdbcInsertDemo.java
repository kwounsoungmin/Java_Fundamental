package _2019_12_10;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		// 1.
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // 드라이버클래스를 동적으로 올려두는작업을함.
														// 문자열로들어있는크랠스를 메모리에 올려줌
														// 이게 forname
			// "org.mariadb.jdbc.Driver" 이드라이브 파일을 메모리에 로딩시켜주는작업 (드라이버가클래스)
			// 뭐하는지는몰라,
			System.out.println("드라이브로드 성공!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2
		Connection con = null; // 닫을 목적으로 밖에 선언
		PreparedStatement pstmt = null;// sql문 전송용도
		try {
			con = DriverManager.getConnection(
					// 데이터 베이스와 연결을 시도하는것
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12"// password

			);
			System.out.println("데이터 베이스에 연결을 성공했어요.");
			StringBuffer sql = new StringBuffer(); // 스트링 버퍼로 이어서 써라. 스트링 버퍼는
													// equals오버라이딩 안씀 그래서 투스트링으로
													// 바꾸어사용해야함
			// 3
			sql.append("INSERT INTO dept(deptno,dname,loc) VALUES(?,?,?);");
			// 반드시 하이드 에스큐엘에서 실행해보고 가져오자.
			// SQL문을 전송할 수 있는 prepareStatement 객체를 생성하고 그값을 넣는것은 ? 로 둔다.
			pstmt = con.prepareStatement(sql.toString()); // 스트링버퍼는 tostring으로
															// 바꾸어 스트링으로 값을 넣자.
			// 각각이 물음표에 값을 넣어준 순서이다. pstmt로 넣는다.
			// 4. 복붙한 sql문에서 바인딩 변수(?,?,?)을 설정해준다.
			pstmt.setInt(1, 60);
			pstmt.setString(2, "ANAYLSIS");
			pstmt.setString(3, "LA");

			// 5. sql문을 전송한다.

			int result = pstmt.executeUpdate();// dml문 인 insert,update,delete를
												// 실핼 할때 executeUpdate 사용.
			// 여기서 result는 갠신된행의 수이다. dml이 갱신된행의 수를 반환하기때문.
			System.out.println("갱신된 행의 수 : " + result);

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
