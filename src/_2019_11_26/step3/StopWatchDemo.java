package _2019_11_26.step3;


public class StopWatchDemo {
	public static void main(String[] args) {
		StopNanoWatch s = new StopNanoWatch();
		
		s.start();
		for(long i=0;i<5000000000l;i++){
		}
		s.stop();
		
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
		
		
		
		
	}
	
	
}

//출력만 바쭤주면 되도록 바꿔줬다.

//상황에따라 main은바뀌면 안됨
//여전히 main에 for문있네..

//좀더 접근제어자와 기능에따라 캡슐화 클래스를묶어주자

//step4 시작 끝 시간을 상속으로 , 추상클래스 이용

