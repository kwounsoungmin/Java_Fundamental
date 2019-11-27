package _2019_11_26.step6;
//1.최종본 모든클래스의 캡슐화
//2.메인클래스의 java reflection추가.

public class StopWatchDemo {
	public void execute(StopWatch s) { // 추상클래스의 다형성 구현, 이코드를보면 추상메서드는
										// 호출방법이없고(new x) 그 자식에서 만든객체가져온것
		s.run();
	}

	public static void main(String[] args) throws Exception {
		String input = args[0];
		String className = "_2019_11_26.step6.StopWatch"+input; // 리플랙션을이용하여 뽑아낼 수 있다~문자열로들어온 클래스명을 객체화 할 수있다.
		//이렇게하면 객체이름을 받고 생성도 가능해
		StopWatch s =(StopWatch)Class.forName(className).newInstance();
		StopWatchDemo swd = new StopWatchDemo(); // 인스턴스 메소드의 호출은 객체 생성으로 만약
													// execute가 static으로 메서드만들면
													// 그냥 사용가능 ㅎㅎ

		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);

		StopNanoWatch s2 = new StopNanoWatch();
		swd.execute(s2);

		StopMicroWatch s3 = new StopMicroWatch();
		swd.execute(s3);

		
		
		/*stopWatch s1= new StopMilliWatch(); //이런게 가능하다!
		 * */
		
	}
}
// 상황에따라 main은바뀌면 안됨
// 좀더 접근제어자와 기능에따라 캡슐화 클래스를묶어주자

// step4 시작 끝 시간을 상속으로 , 추상클래스 이용
