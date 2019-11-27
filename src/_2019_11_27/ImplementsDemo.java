package _2019_11_27;
/**
 * ->자바 다큐멘테이션 주석이다. 주석은 총 3개였다.
 * api올렸을때 다른 주석은 사라지지만 이건 같이 api로 올라가!
 * 
 이 런식으로 주석 달면 클래스가 무얼하나 이야기한다.
 */

import java.util.*;
//순서 패키지 맨위 다음 import문 오도록
//https://docs.oracle.com/javase/8/docs/api/ 여기들어가면 자바 에서 쓰는 메서드등 의 원형 볼수 있다.
public class ImplementsDemo {
	/**
	 * 이메서드는 jvm이 호출해주는 메서드 입니다.
	 * @param args
	 */
	public static void main(String[] args) {
		//Data d= new Date(); 모호해
		java.util.Date d = new java.util.Date();
		
	InterA a = (InterA) new ImplementsDemo();// 인터페이스도 추상클래스도 객체 생성 못하고 오버라이딩에의해 자식에있는 객체생선해!
		a.mA();
		a.mB();
		a.mC();
	}
}
