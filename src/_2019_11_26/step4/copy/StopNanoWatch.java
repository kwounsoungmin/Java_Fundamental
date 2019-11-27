package _2019_11_26.step4.copy;

public class StopNanoWatch {
	private long startTime;
	private long endTime;
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
}
