package _2019_11_26.step6;

public class StopMilliWatch extends StopWatch {
	// 이제 세터게터통해 값을 받아오고 수정한다.
	private void start() {
		setStartTime(System.currentTimeMillis());
	}

	private void stop() {
		setEndTime(System.currentTimeMillis());
	}

	public double getElapsedTime() {
		return (double) (getEndTime() - getStartTime()) / (double) 1000;
	}

	public void run() {
		start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
