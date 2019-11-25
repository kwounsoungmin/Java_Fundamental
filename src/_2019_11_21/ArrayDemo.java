package _2019_11_21;

public class ArrayDemo {

	public static void main(String[] args) {
		// 배열의 선언
		int[] arr1 = new int[4];
		// 선업법2--지양함
		int[] b = new int[]{ 1, 2, 3, 4 };
		// 선언법3--지양함
		int c[] = { 1, 2, 3, 4 };

		// int[]b=new int[4]{1,2,3,4};(x) 뒤 int 에 사이즈 넣으면 선언이야 절대 안돼!
		// 배열의 값할당 연습 arr1[0]=1,값의 변경 가능~
		for (int i = 1; i < 5; i++) {
			arr1[i - 1] = i;
		}
		// 배열의 출력
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
		// 배열의 생성과 설정
		int[] arr2 = { 1, 2, 3, 4 };
		arr2[0] = 100;

		// enhanced for loop -> 향상된 for문 이용 배열(타입 동일하고 알때 사용가능)을 출력할때 활용
		// 배열의 이름을 뒤에넣으면 자동으로 temp에 그배열에 0번째 값을 넣어준다.
		// 그후 0인덱스부터 반복해서 연산 을 수행해 즉 값만 출력하고 싶을때는 쓰자, 정확성이높다
		// 컬렉션은 제네릭을 안쓰면 사용 못해~ 왜 데이터 타입 temp와 같아야 넣을 수있도록보장되야해
		for (int temp : arr2) {
			System.out.println(temp);
		}

	}

}
