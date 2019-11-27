package _2019_11_26;

public class ChildDemo {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.age = 55;// 부모에있는것만쓼 수 있다.
		p1.work();//보모꺼 호출
		p1.playBadook();//부모꺼

		Child c1 = new Child();
		c1.height = 155.24;
		c1.playBadook();
		c1.playGame(); //자식꺼
		c1.work();// work 오버라이딩  자식꺼
		
		//객체의 형변환 1. 오토캐스팅됨
		Parent p2 = new Child();
		//p2.height = 155.24;-> 안됨
		p2.playBadook();
		//p2.playGame();  --> 안됨
		p2.work();// work 오버라이딩 --> 부모가아니라 자식에있는 work 호출!!!! 자식꺼
		//child c2 =(child) new Parent(); //이런건안됨.. 강제캐스티애도 참조항 child객체가 없으니.
	}
}
