package _2019_11_26.step2;

//StopWatch 클래스엔 나노와 밀리의 코드가 다 몰려있고  데모에선 실main실행함
//
//이젠 로직이 안보이고 메서드만 호출해서 사용할 수 있도록된다.
public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch(); // StopWatch클래스의 객체 생성
		s.startNano();
		for(long i=0;i<5000000000l;i++){
			
		}
		s.stopNano();
		double elapsedTime = s.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	// 이렇게 나노를 구할 순 있지만 바꿀경우 스타그 부분을 바꿔줘야하고 출력도 %.3으로 바꾸는든등 가능하게구현
	//답 조언: 고객이 마이크로 세컨즈 요청시 다시 다갈아업어서 스탐워치클래스를 또 건드리고 클래스의 아이덴티티가 3개가되지.. 클래스를분리해라.
}
