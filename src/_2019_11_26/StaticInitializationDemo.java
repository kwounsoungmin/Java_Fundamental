package _2019_11_26;

public class StaticInitializationDemo {
	//i18n -internationalization국제화: 한국어를영어로 i~n까지 줄여 사용 국제화의미
	//l10n -localization 지역화:
	int age; // 인스턴스변수
	static String title; // 스테틱변수

	static{
	title ="모기지론";
	System.out.println("ststic block");
	}
	//static 블록먼저 메모리에 올리고 그다음 메인 그후 생성자만드는 실행순서를 보인다.

	public StaticInitializationDemo() {
	}

	public StaticInitializationDemo(int age) {
		this.age = age;
	System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		StaticInitializationDemo s = new StaticInitializationDemo();
		new StaticInitializationDemo(10);
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
		//Math m =new Math();
		//에러난다 왜냐 Math 클래스는다 static으로만들어서 사용하기에 객체생성할 수 없다.
		
//static변수는 모든 객체가공유하는변수이기에 값을 픽스해준것이다.
	}

}

/*
 * 
 * 멤버변수의 종류 인스턴스 static 두개 인스터스는 생성자 stati초기화는 static초기화로 static 초기화
 * 
 * static{ }
 */
