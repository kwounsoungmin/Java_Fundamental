package _2019_11_27;

import java.util.ArrayList;

public class wrapperDemo {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		//list.add(1);// --> 1.4로 컴파일시 오류.. 예전엔안되던건데 자바컴파일러 1.5 or 4.0부터 자동으로 래퍼클래스 오 바꾸는 게 가능!
		//wrapper class로 변환하여 저장해야 한다.
		list.add(new Integer(1));
		Integer i1=(Integer)list.get(0);
		//으로바꿔서 해준다.
		list.add(1);// 오토박싱
		list.add(2);// 오토박싱
		Integer i3=(Integer)list.get(0);
		Integer i4=(Integer)list.get(1);

		int a= i3+i4; // 오토 언 박싱!
		String str =10 + ""; //"10" 만드는 아주 저급한 방법
		String st = String.valueOf(10); // "10"만드는 우아한 방법!
		//문자열을 int 로 바꿀때 사용!
		int d= Integer.parseInt("100");
	}

}
