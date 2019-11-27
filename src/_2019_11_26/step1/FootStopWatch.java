package _2019_11_26.step1;
//1.고객의 요구사항: 밀리 세컨드로 경과 시간을 만들어주세요 (스톱워치)
//-> 요구사항 변경 2. 나노세컨그로 경과 시간을 만들어주세요.. 번복..
// FootStopWatch 대충만든 것을 의미
 // -> 반환 타입이 long이라 변수ㅡ long				

public class FootStopWatch {
	//인스턴스 변수 를선언하여 oop의특징을 살려보자.
	long startTime;
	long endTime;
	public double getElapsedMilliTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		//1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 반환
		f.startTime = System.currentTimeMillis();
		//시작시간을 구함.
		for(long i=0;i<5000000000l;i++){	
		}
		
		f.endTime = System.currentTimeMillis();
		double elapsedTime=(double)(f.endTime-f.startTime)/(double)1000;
		System.out.printf("경과시간 : %.3f", elapsedTime);
		
	}
}

//문제 1 로직이 main에 다들어가면 안됨.
//문제 2 통으로 들어간걸 분리하라..

	
