package _2019_11_25;

public class VarArgDemo {

	public void m(int... test) {
		int length = test.length;
		if (length == 1) {
			System.out.printf("인자가1개입니다. %d\n", test[0]);

		} else if (length == 2) {
			System.out.printf("인자가2개입니다. %d ,%d \n", test[0], test[1]);
		} else {
			System.out.printf("인자가3개입니다. %d, %d ,%d \n", test[0], test[1], test[2]);
		}
	}

	public static void main(String[] args) {
		VarArgDemo v = new VarArgDemo();
		v.m(1);
		v.m(1, 2);
		v.m(1, 2, 3);
	}

}
