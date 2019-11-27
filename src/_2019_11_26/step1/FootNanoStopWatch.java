package _2019_11_26.step1;

//1.고객의 요구사항: 밀리 세컨드로 경과 시간을 만들어주세요 (스톱워치)
//2. 나노세컨그로 경과 시간을 만들어주세요.. 번복..
// FootStopWatch 대충만든 것을 의미
//f.startTime = System.currentTimeMillis(); // -> 반환 타입이 long이라 변수ㅡ long
//1970년 1월1일부터 지금까지 시간을 밀리세컨드로 반환 반환형은 더블 시간 젤 수 있음.
//2. 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요... 제발...
public class FootNanoStopWatch {
	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;
	
	//연산부분의 메서드를 밖으로뺌
	//밀리타임 연산 메서드
	public double getElapsedMilliTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	//나노타임 연산 메서드 +0 6개
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000_000_000;
	}
	
	
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		//1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 반환
		//f.startTime = System.currentTimeMillis();
		f.startNanoTime = System.nanoTime();
		
		for(long i=0;i<8000000000l;i++){
			
		}
		
		//f.endTime = System.currentTimeMillis();
		f.endNanoTime = System.nanoTime();
		
		double elapsedTime = f.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f %n", elapsedTime);
	}
}
//팀장님 ->여전히 main에 다때려박아 뒀다.. 조언 같은 성격 끼리 묶어라. 클래스는 아이덴티티가있다. 이건 밀리랑 나노가 같이 비벼져있잖아..클래스를분리하라(step 2)





	

