package _2019_11_20;

public class BreakDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			if (i == 5) {
				// 해당 수행을 중지 반복문을 빠져 나가는 break;
				break;
			}

		}
		System.out.println(sum);

		outter: for (int j = 2; j < 9; j++) {
			for (int k = 1; k < 9; k++) {
				if (j == 4 && k == 9)
					// 해당 수행을 중지 반복문을 빠져 나가는 break; 이는 그 블록 을 빠져나간다. 특히 해당반복문에
					// lable이라고 이름을 정해서 브레이크로 빠져나감
					break outter;
				System.out.printf("%d*%d=%d%n", j, k, j * k);

			}

		}

	}

}
