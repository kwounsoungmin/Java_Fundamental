package _2019_11_21;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		// System.arraycopy()메소드 배열의 모든 부분이나 특정 부분을 copy할 수 있다.
		/*
		 * 경우 1. 배열을 참조해서 다른 변수에서 사용 2. 원본 데이터를 복사하여 사용
		 * 
		 * 자바에서 배열은 기존의 배열 방을 늘릴수 없고 새로 더큰걸 만들어 복사하는 방법 뿐이다. (원본배열, 원본어디서부터(인덱스
		 * 기준),어디에다 (배열의 이름),복사하는곳의 시작 인덱스,복사의 개수)
		 * 
		 */
		String[] fruits = { "apple", "banna", "watermelon", "peach" };

		String[] temp = new String[6];
		// fruits=>원본 배열

		// 0=> 원본배열릐 위피, 즉 원본배열의 복사할 시작위치
		// temp=> 복사할 배열의 이름
		// 2=> 복사할 배열의 시작 위치
		// 4=> 원본배열릐 4개 요소를 복사
		System.arraycopy(fruits, 0, temp, 2, 4);
		// 이때 조금이라도 말이 안되면 복사 안되고 에러나니 잘따져줘
		temp[0] = "blueberry";
		temp[1] = "rasberry";

		for (String fruit : temp) {
			System.out.println(fruit);
		}

		// ref가 fruits를 참조함. 즉 ref[0]=fruits[0]="jobs" 의 의미이다.
		String[] ref = fruits;
		ref[0] = "jobs";
		System.out.println(fruits[0]);
		System.out.println(ref[0]);

		int[] a = { 1, 2, 3, 4 }; // 이것도 이금 new 생략되어 새로운 객체 만든거야
		int[] b = new int[] { 1, 2, 3, 4 };
		int[] c = b;
		
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a == c);
		
		
		
	}

}
