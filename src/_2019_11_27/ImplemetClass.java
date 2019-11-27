package _2019_11_27;
//인터페이스를 왜만들었을까?  다중상속의 기능을활용해 코딩하려고~
public class ImplemetClass implements InterA{
//이렇게하면 빨간줄 뜬거 추상 메서드 오버라이딩 안해서 그런거니까 눌러서 Add로 @Override 자동으로 다되게해줘야해
	@Override
	public void mB() {
		
		System.out.println("mB()");
	}

	@Override
	public void mC() {
		System.out.println("mC()");
		
	}
	
	//인터페이스의 접근한정자는 무조건 public 이니까 생략되도 그건 디폴트가아니라 퍼블릭이야.. 잊지마!
	/*
	 * 이런식으로 오버라이딩 하면 절대 안됨...
	 *  void mB() {
		// TODO Auto-generated method stub
		System.out.println("mB()");
	}
	  
	  
	  */

	@Override
	public void mA() {
		System.out.println("mA()");
		
	}

}
