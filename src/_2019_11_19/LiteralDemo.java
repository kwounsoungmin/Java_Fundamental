package _2019_11_19;

public class LiteralDemo {

	public static void main(String[] args) {
//		byte b1=128;(X) 에러남 overflow byte(값의 범위:-128~127)255개
		int a1= 128; // 10진수 리터럴 (기본)
		int a2 = 076;// 8 진수 -> 10진수 (62)
		int a3=0x123;//16진수
		int a4=0b10101;// 2진수
		
System.out.println(a1);

System.out.println(a2);

System.out.println(a3);

System.out.println(a4);

long l1=220000l; //long은 숫자뒤 l or ㅣ
float f1=123.43f;// float 는 숫자뒤 f or F
double d1= 123.56;// 더블은 소수점만 표현된경우 D or d의 생략가능
boolean ex= false; // 불리언은 참아님거짓만 반환

a1=10;
d1=10.0;
//primitive타입의 ==연산자는 값만 비교함
System.out.println(a1==d1);

int first=10;
int second = first;
first=20;
System.out.println(first);
System.out.println(second);
//이의미가 중요해 보면 primitive는  참조가 안되서 각값에 영향 주지 x 그러니 20 10 나오지 
	}

}
