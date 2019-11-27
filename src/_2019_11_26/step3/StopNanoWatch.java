package _2019_11_26.step3;

public class StopNanoWatch { //궂이 클래스명에 나노가 있는데 변수명에 나노를 넣을 필요가 없다., 메서드 역시빼주자.
	private long startTime;
	private long endTime;
	public void start(){
		startTime = System.nanoTime();
	}
	public void stop(){
		endTime = System.nanoTime();
	}
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000000000;
	}
}
