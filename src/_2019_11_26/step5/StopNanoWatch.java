package _2019_11_26.step5;

public class StopNanoWatch extends StopWatch {

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}

	public void run() {
		start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
