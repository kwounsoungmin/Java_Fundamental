package _2019_12_10.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _2019_12_10.dto.DeptDTO;

//insert,delete,select 만들자.
public class DeptDao {
	// forName이 스테틱 메서드 니까 스테틱 초기화 하는게 제일 이뻐
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // 드라이버클래스를 동적으로 올려두는작업을함. 메모리로드라는 클래스에 스테틱변수를 쫙올려만두고 객체생성은 아님 
														// 문자열로들어있는크랠스를 메모리에 올려줌
														// 이게 forname
			// "org.mariadb.jdbc.Driver" 이드라이브 파일을 메모리에 로딩시켜주는작업 (드라이버가클래스)
			// 뭐하는지는몰라,
			System.out.println("드라이브로드 성공!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 1.singeton pattern , 절대 객체를 2개 생성할 수 없도록 함.
	private static DeptDao single; // 자기자신타입으로 자기자신선언

	private DeptDao() {
		//new org.mariadb.jdbc.Drive();
		//스테틱 초기화를안하면 위코드를 생성자에 넣어둔다.
	}

	public static DeptDao getInstance() { // 생성자를 프라이빗으로 두고
		if (single == null) {
			single = new DeptDao(); // 널일때만 객체를만들고

		}
		return single; // 아니면 자기자신 반환
	}

	// 반환형을 보면 삽입 되면 트루 아니면 펄스 줄려는것
	public boolean insert(DeptDTO dto) {// dept의 정보를 삽입하겠다..
		boolean IsSuccess = false;
		Connection con = null; // 닫을 목적으로 밖에 선언
		PreparedStatement pstmt = null;// sql문 전송용도
		try {
			con = DriverManager.getConnection(
					// 데이터 베이스와 연결을 시도하는것
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12"// password

			);

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
			int index = 0;
			pstmt.setInt(++index, dto.getNo());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());

			// 5. sql문을 전송한다.

			int result = pstmt.executeUpdate();// dml문 인 insert,update,delete를
			// 만약 반환형이 int면 result 반환하면됨 // 실핼 할때 executeUpdate 사용.
			// 여기서 result는 갠신된행의 수이다. dml이 갱신된행의 수를 반환하기때문.
			System.out.println("갱신된 행의 수 : " + result);
			IsSuccess = true;
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

		return IsSuccess;

	}

	public boolean update(DeptDTO dto) { // dept의 정보를 업데이트하겠다.
		boolean IsSuccess = false;
		Connection con = null; // 닫을 목적으로 밖에 선언
		PreparedStatement pstmt = null;// sql문 전송용도

		try {
			con = DriverManager.getConnection(
					// 데이터 베이스와 연결을 시도하는것
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12"// password

			);

			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept SET dname = ?,loc = ? WHERE DEPTNO = ?");
			pstmt = con.prepareStatement(sql.toString());
			int index = 0;
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());
			pstmt.setInt(++index, dto.getNo());

			pstmt.executeUpdate();// dml문 인 insert,update,delete를
									// 실핼 할때 executeUpdate 사용.
			// 여기서 result는 갠신된행의 수이다. dml이 갱신된행의 수를 반환하기때문.
			IsSuccess = true;

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
		return IsSuccess;
	}

	public boolean delete(int deptNO) {// dept의 정보를 삭제 하겠다..
		boolean IsSuccess = false;
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
			int index = 0;
			pstmt.setInt(++index, deptNO);

			int result = pstmt.executeUpdate();
			IsSuccess = true;
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

		return IsSuccess;
	}

	public ArrayList<DeptDTO> select() {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
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
				int index = 0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				list.add(new DeptDTO(deptno, dname, loc));

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
		return list;
	}

	public DeptDTO select(int deptNo) { // 프라이머리 키로 로 하나만 가져 오는것 널이면 데이터 없다 널아니면
										// 값 보냄
		DeptDTO dto = null; // 생성자로 뉴할려고하는것
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
			sql.append("where deptno =? ");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, deptNo);
			rs = pstmt.executeQuery(); // select 문일때 전송하는메소드

			if (rs.next()) {
				index = 0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				dto = new DeptDTO(deptno, dname, loc);

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
		return dto;
	}

}
