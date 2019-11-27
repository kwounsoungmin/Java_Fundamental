package _2019_11_26.step2;
//팀장님 지시 사항  : step2에선 메인에 들어있던 걸 빼서 실제클래스와 실행되는 부분을 분리하자. 
//시간 제는것연산과 변수 를 클래스로 다빼자.
//2.시간을 추출하는 시작끝 기능 메서드로 빼기

public class StopWatch {
	//밀리에 해당하는 멤버변수
	long startTime;
	long endTime;
	//나노에 해당하는 멤버변수
	long startNanoTime;
	long endNanoTime;
	
	//밀리의 시작시간 끝시간, 경과시간 메서드
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	
	public double getElapsedMilliTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	//나노의 시작시간 끝시간,경과시간 메서드 
	
	public void startNano(){
		startNanoTime = System.nanoTime();
	}
	public void stopNano(){
		endNanoTime = System.nanoTime();
	}
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000000000;
	}
	
	
}





