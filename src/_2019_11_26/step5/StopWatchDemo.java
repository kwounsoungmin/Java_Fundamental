package _2019_11_26.step5;
//1.실제 비지니스 로직을 해당 클래스에 추가하여 데모클래스를깔끔히

//2.클래스들의 공통요소가 있다면 부모 클래스로 상속을 하는 방향으로가자

public class StopWatchDemo {
	public void execute(StopWatch s) { // 추상클래스의 다형성 구현, 이코드를보면 추상메서드는
										// 호출방법이없고(new x) 그 자식에서 만든객체가져온것
		s.run();
	}

	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo(); // 인스턴스 메소드의 호출은 객체 생성으로 만약
													// execute가 static으로 메서드만들면
													// 그냥 사용가능 ㅎㅎ

		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);

		StopNanoWatch s2 = new StopNanoWatch();
		swd.execute(s2);

		StopMicroWatch s3 = new StopMicroWatch();
		swd.execute(s3);

	}
}
// 상황에따라 main은바뀌면 안됨
// 좀더 접근제어자와 기능에따라 캡슐화 클래스를묶어주자

// step4 시작 끝 시간을 상속으로 , 추상클래스 이용
