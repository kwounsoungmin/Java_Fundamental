package _2019_11_25;

public class OverRodingDemo {
	// overroding의 작성규칙

	/*
	 *  1.같은 클래스 내에서 만 가능하다.
	 *  2. 메서드이름은 같게 
	 *  3. 매개변수 의 갯수가같으면 자료형이 달라야한다.
	 *  4.매개변수의 갯수가 달라야한다.
	 *  5.접근한정자와 리턴타입은 같지않아도됨 (영향안줌)
	 *  
	 */
	
	public void print(String str){
		System.out.println(str);
	}
	public void print(int i){
		System.out.println(i);
	}
	public void print(double d){
		System.out.println(d);
	}
	public void print(char c){
		System.out.println(c);
	}
	public void print(boolean b){
		System.out.println(b);
	}

	public static void main(String[] args) {
		OverRodingDemo o = new OverRodingDemo();
		o.print(true);
		o.print("hi");
		o.print(23+32);
		o.print(32.231);

	}

}
