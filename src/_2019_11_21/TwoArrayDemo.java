package _2019_11_21;

public class TwoArrayDemo {

	public static void main(String[] args) {
		int[][] a = new int[3][2];
		// int 2차원 배열
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;

		int[][] b = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(a[i][j] + "\t");
			}
			// 이렇게 출력해야 멋져~
			System.out.println();

		}
		// 이런식으로 이차원 배열의 동적 생성도 가능하다.
		int[][] c = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
		int[][] d = new int[3][];
		
		d[0] = new int[1];
		d[1] = new int[2];
		d[2] = new int[3];
		d[0][0] = 1;
		d[1][0] = 2;
		d[1][1]=3;

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.printf(d[i][j] + "\t");
			}
			System.out.println();
		}
		//System.arraycopy()메소드 배열의 모든 부분이나 특정 부분을 copy할 수 있다.
		/*경우
		 * 1. 배열을 참조해서 다른 변수에서 사용
		 * 2. 원본 데이터를 복사하여 사용 
		 * 
		 * 자바에서 배열은 기존의 배열 방을 늘릴수 없고 새로 더큰걸 만들어 복사하는 방법 뿐이다.
		 * (원본배열, 원본어디서부터(인덱스 기준),어디에다 (배열의 이름),복사하는곳의 시작 인덱스,복사의 개수)
		 * 
		 */
		
	}
}
