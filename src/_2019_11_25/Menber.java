package _2019_11_25;
//정보의 은닉화
public class Menber {
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;
 //자바는 Static fianl 변수 를 제외하고는 공개 x, 멤버변수는 무조건 숨김
	// name 에 대한 setter메서드
	public void setName(String n) {
		name = n;
	}

	// name 에 대한 getter메서드
	public String getName() {
		return name;
	}

	// zipcode 에 대한 setter메서드-> 유일한 값의 설정
	public void setZipcode(String z) {
		zipcode = z;
	}

	// zipcode 에 대한 getter메서드-> 값 얻어오기
	public String getZipcode() {
		return zipcode;
	}

	// address1 에 대한 setter메서드-> 유일한 값의 설정
	public void setAddress1(String a1) {
		address1 = a1;
	}

	// address1 에 대한 getter메서드-> 값 얻어오기
	public String getAddress1() {
		return address1;
	}

	// address2 에 대한 setter메서드-> 유일한 값의 설정
	public void setAddress2(String a2) {
		address2 = a2;
	}

	// address1 에 대한 getter메서드-> 값 얻어오기
	public String getAddress2() {
		return address2;
	}

	// ssn 에 대한 setter메서드-> 유일한 값의 설정
	public void setSsn(String s) {
		ssn = s;
	}

	// ssn 에 대한 getter메서드-> 값 얻어오기
	public String getSsn() {
		return ssn;
	}

	// age 에 대한 setter메서드-> 유일한 값의 설정
	public void setage(int i) {
		age = i;
	}

	// age 에 대한 getter메서드-> 값 얻어오기
	public int getage() {
		return age;
	}

	// height 에 대한 setter메서드-> 유일한 값의 설정
	public void setheight(double d) {
		height = d;
	}

	// height 에 대한 getter메서드-> 값 얻어오기
	public double getheight() {
		return height;
	}

	// password 에 대한 setter메서드
	public void setPassword(String p) {
		password = p;
	}

	// password 에 대한 getter메서드
	public String getPassword() {
		return password;
	}

	// email 에 대한 setter메서드
	public void setEmail(String p) {
		email = p;
	}

	// email 에 대한 getter메서드
	public String getEmail() {
		return email;
	}

}
