package _2019_12_10.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _2019_12_10.dto.DeptDTO;
import _2019_12_10.dto.SalGradeDTO;

public class SalGradeDao {
		static {
			try {
				Class.forName("org.mariadb.jdbc.Driver"); 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		
		private static SalGradeDao single; 

		private SalGradeDao() {
		}

		public static SalGradeDao getInstance() { // 생성자를 프라이빗으로 두고
			if (single == null) {
				single = new SalGradeDao(); // 널일때만 객체를만들고

			}
			return single; // 아니면 자기자신 반환
		}

		
		public boolean insert(SalGradeDTO dto) {
			boolean IsSuccess = false;
			Connection con = null; 
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
						"acorn12", // user
						"acorn12"// password
				);

				StringBuffer sql = new StringBuffer(); 
				sql.append("INSERT INTO SALGRADE(GRADE,LOSAL,HISAL) VALUES(?,?,?);");
				// 반드시 하이드 에스큐엘에서 실행해보고 가져오자.
				// SQL문을 전송할 수 있는 prepareStatement 객체를 생성하고 그값을 넣는것은 ? 로 둔다.
				pstmt = con.prepareStatement(sql.toString()); // 스트링버퍼는 tostring으로
																// 바꾸어 스트링으로 값을 넣자.
				// 각각이 물음표에 값을 넣어준 순서이다. pstmt로 넣는다.
				// 4. 복붙한 sql문에서 바인딩 변수(?,?,?)을 설정해준다.
				int index = 0;
				pstmt.setInt(++index, dto.getGrade());
				pstmt.setInt(++index, dto.getLosal());
				pstmt.setInt(++index, dto.getHisal());

				// 5. sql문을 전송한다.

				int result = pstmt.executeUpdate();// dml문 인 insert,update,delete를
				// 만약 반환형이 int면 result 반환하면됨 // 실핼 할때 executeUpdate 사용.
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

		public boolean update(SalGradeDTO dto) {
			boolean IsSuccess = false;
			Connection con = null; 
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
						"acorn12", // user
						"acorn12"// password
				);

				StringBuffer sql = new StringBuffer();
				sql.append("UPDATE SALGRADE SET LOSAL = ?,HISAL = ? WHERE GRADE = ?");
				pstmt = con.prepareStatement(sql.toString());
				int index = 0;
				pstmt.setInt(++index, dto.getLosal());
				pstmt.setInt(++index, dto.getHisal());
				pstmt.setInt(++index, dto.getGrade());

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

		public boolean delete(int salgrade) {
			boolean IsSuccess = false;
			Connection con = null; 
			PreparedStatement pstmt = null;						
			try {
				con = DriverManager.getConnection(
						// 데이터 베이스와 연결을 시도하는것
						"jdbc:mysql://localhost/acorn?autoReconnect=true", // url
														
						"acorn12", // user
						"acorn12"// password
				);

				StringBuffer sql = new StringBuffer();
				sql.append("DELETE "); 
				sql.append("FROM SALGRADE "); 
				sql.append("WHERE GRADE =? ");
				pstmt = con.prepareStatement(sql.toString());
				int index = 0;
				pstmt.setInt(++index, salgrade);
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

		public ArrayList<SalGradeDTO> select() {
			ArrayList<SalGradeDTO> list = new ArrayList<SalGradeDTO>();
			Connection con = null; // 닫을 목적으로 밖에 선언
			PreparedStatement pstmt = null;// sql문 전송용도
			ResultSet rs = null; // 커서맨위로 ResultSet

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
						"acorn12", // user
						"acorn12"// password
				);
				
				StringBuffer sql = new StringBuffer();
				sql.append("SELECT grade , losal, hisal ");
				sql.append("FROM salgrade ");
				sql.append("ORDER BY grade ");

				pstmt = con.prepareStatement(sql.toString());
				rs = pstmt.executeQuery(); // select 문일때 전송하는메소드

				while (rs.next()) {
					int index = 0;
					int deptno = rs.getInt(++index);
					String dname = rs.getString(++index);
					String loc = rs.getString(++index);
				//list.add(new SalGradeDTO(grade, losal, hisal));	-> 여기부터

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
}