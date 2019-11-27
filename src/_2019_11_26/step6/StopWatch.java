package _2019_11_26.step6;

public abstract class StopWatch {
	// 멤버변수 에대한 ptivate로 캡슐화 -> 이를 통해 값의 주고 받는 문하나열어줌 
	
	private long startTime;
	private long endTime;
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public abstract void run();

	// public void run(){} -> 이렇게 하면 강제성이없어, 사용은가능
	// 그래서 추상을이용해서 만들고 상속을 통해서 run메서드릐 오버라이딩 강제성이생겨 에러 없이가능하다.

	// public abstract void run(){

}
