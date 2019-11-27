package _2019_11_26;

public class Child extends Parent {//Parent를 상속 받는다.
	double height = 170.23;
//오버라이딩(overriding) : 부모의 메서드를 재정의 (1>부모의 기능에 추가 or2> 자식에서 재정의)
	//1. 메서드의이름, 매개변수 ,반환형 일치할것, 반드시 상속관계에서만가능하다.
	//2.접근 한정자는 부모보다 자식이 상위이거나 같으면됨
	public void work() {
		//super.work(); // 1>자식의 도움을 받아서 하니까 , 부모의 워크를 쓰고 싶을때 이용해줘
		System.out.println("child work()");
	}

	public void playGame() {
		System.out.println("child playGame()");
	}
}
