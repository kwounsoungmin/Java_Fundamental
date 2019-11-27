package _2019_11_26.step5;

public abstract  class StopWatch {
	//공통분모를 뽑아보자 부모클래스로
	 long startTime;
	 long endTime;
	 public abstract void run(); 
	 
	// public void run(){}  -> 이렇게 하면 강제성이없어, 사용은가능
	 //그래서 추상을이용해서 만들고 상속을 통해서 run메서드릐 오버라이딩 강제성이생겨 에러 없이가능하다.
	 
	// public abstract void run(){
		 
	 
}
