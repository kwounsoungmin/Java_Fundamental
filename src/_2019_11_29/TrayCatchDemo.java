package _2019_11_29;

public class TrayCatchDemo {

	public static double getAvg(int k, int e){
		int sum = k+e;
		double avg=(double)sum/(double)2;
		return avg;
		
	}
	public static void main(String[] args) {
		try{
		int k =Integer.parseInt(args[0]);
		int e =Integer.parseInt(args[1]);
		double average = getAvg(k,e);
		System.out.printf("평균 : %f",average);
		}catch(NumberFormatException e){
			System.err.println("예외문자말고 숫자만 계산 가능합니다. ^^");
			System.err.println();
			System.err.println(e.getMessage()); //문제가되는 입력보여줘
			e.printStackTrace(); // 에러난경로 쭉 보여줘. (개발 초보습관+1), 사용자페이지엔 안나오고 콘솔에만뿌려
		//printf대신 err로 예외 출력가능 이클립스에서만 이런것임 콘솔엔 적용x
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at _2019_11_29.TrayCatchDemo.main(TrayCatchDemo.java:12)
	이런 에러나 그러니 run 에 런컨피규레이션에 아큐먼트에 값 넣자.
	-> 그럼잘됨
	
	하지만 만약 이상한 문자같은거넣으면
	Exception in thread "main" java.lang.NumberFormatException: For input string: "5a"
	at java.lang.NumberFormatException.forInputString(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at _2019_11_29.TrayCatchDemo.main(TrayCatchDemo.java:13)
	이런 애러나 !-> 예외처리해주자
	
		 */
		
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("국어와 영어점수 2개의 숫자를넣어주세요. ^^");
		//숫자 2개를 넣지 않았을떄 예외
	}
		

	}

}

