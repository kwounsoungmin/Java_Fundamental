package _2019_11_25;

public class MethodDemo {
	// 이렇게 메소드는 클래스 안에 메인 밖에 선언 하며 가져다 쓰기 편리하게 정리한다.
	//메소드의 활용 
	public long plus(int first, int second) {	//int first, int second 는 매개변수로 "parameter"라함.
		return first + second;
	}

	public double divide(int first, int second) {
		return (double) first / (double) second;
	}

	public int[] asending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[i] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public boolean isLeafYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
	}

	public void print(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		

		MethodDemo md = new MethodDemo();
		//int temp1 = md.plus(10, 20);  //여기서 10과 20은 전달인자 "argument"이다.
		//System.out.println(temp1);

		double temp2 = md.divide(22, 5);
		System.out.println(temp2);

		int[] temp4 = { 1, 23, 2, 4, 32, 21, 41, 8 };

		int[] temp5 = md.asending(temp4);

		for (int value : temp5) {
			System.out.printf(value + "\t");
		}
		boolean temp6 = md.isLeafYear(2019);
		if (temp6) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		md.print("안녕하세요");
	}

}
