 package _2019_12_10.dto;

public class DeptDTO {
	// 자바는 디테일한 이름으로 클래스 명에 정보가 있기에 변수를 설정하지 않는다.
	// 속성 부분
	private int no;
	private String name;
	private String loc;
	//디폴트 생성자
	public DeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	//생성자
	public DeptDTO(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	//개터 세터
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
