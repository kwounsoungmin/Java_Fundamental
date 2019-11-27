package _2019_11_26;

public class ShapeDemo {
	
public static void run (Shape s){
	s.draw();
}//껍데기

	public static void main(String[] args) {
		//추상클래스는 객체를 생성할 수 없어 자식에게 부탁한다.
		//Shape s = new Shape()---> 이렇게 할 수 없다.
		Shape s1= new Rectangle();
		s1.draw();
		
		Shape s2= new Rectangle();
		s2.draw();
		
		
		run (new Rectangle());// 어떤객체를넣주냐에 따라 작동이다다름.
		run (new Triangle());
		// 타입은 하나지만 계속 new할 수있고 해당클래스의 하위클래스일때 만 new가능

	}

}
