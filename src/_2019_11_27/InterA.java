package _2019_11_27;
//인터페이스의 취지 설계용도
public interface InterA extends InterB, InterC{		// 이런식으로 인터페이스끼리는 다중상속이 가능하다
	//인터페이스 변수는 public static final 생략 가능
 double PI =3.14;
 //인터페이스 메서드의 접근 한정자를 붙이지 않으면 public (static fianl)생략 --> 절대 defualt 아니야 
 //abstract 생략가능
 void mA();
}
