package _2019_11_19;
// 아까 배운 식별자 규칙으로 패키지명만듬
public class IdentifierDemo {
// 클래스명도 만듬 ,클래스명과 생성한 파일의 이름은 같아야 한다!
	public static void main(String[] args) {
	
		System.out.println("두번째 수업");
		int age=10;
		String name ="chrlie";
		String name1 = "철수";
		// 자바에서 문자는 유니코드를 의미함 따라서 세계모든 문자를 구현가능
		
//		잘못된예시
//		String 1father="jhon";(변수명 첫글자에 숫자못옴)
//		String his father="jhon";(변수 명에 공백이 올 수 없음)
//		String void= "jhon"(예약어도 변수 안됨)
		System.out.println(name1);
		System.out.println(name);
		System.out.println(age);

	}

}
