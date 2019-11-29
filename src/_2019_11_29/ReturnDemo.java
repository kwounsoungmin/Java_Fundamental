package _2019_11_29;

public class ReturnDemo {

	public void m() {
		int a = 10;
		int b = 20;
		int c = a + b;
		if (c == 30) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		ReturnDemo cd = new ReturnDemo();
		if (c == 30) {
			return;
		}
		
		System.out.println(c);
	}
}
