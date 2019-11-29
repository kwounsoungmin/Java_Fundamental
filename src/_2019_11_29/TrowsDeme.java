package _2019_11_29;

import java.io.FileOutputStream;

public class TrowsDeme {

	public static double getAverage(int[] temp) throws ArrayIndexOutOfBoundsException {// 일종의경고.
																						// 조건이
																						// 4개넣기
		int sum = 0;
		int k = temp[0];
		int m = temp[1];
		int e = temp[2];
		int h = temp[3];
		sum = (k + m + e + h);
		return (double) sum / (double) 4;
		// 이코드의 문제 하나라도 안 넣으면 ArrayIndexOutOfBoundsException떠
	}

	public static void main(String[] args){ //throws  {

		int[] exam = { 10 }; //1개넣어서 배열이 4개 다안찼어.
		
		try {
			double avg = getAverage(exam);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("국어,영어,수학,국사 4개의 값을 순서대로 다시 넣어주세요 ^^");
// 런타입 익셉션이 상위에있으면 예외 해도되고 안해도됨 그래서 판단이 들어가 어렵다/ex perseInt(String s)같은거
			//그확인은 docs.oracle.com에서 확인.
		}
		/*try{
			FileOutputStream f = new FileOutputStream("~~~~~~");
		//반드시 예외 처리를 해줘야하는 경우 쉬운경우.
		}*/

	}
}
