package _2019_11_26.step4.copy;
//1.실제 비지니스 로직을 메소드로 분리 main 안에 것 다뺌.


public class StopWatchDemo {
	public  void execute(StopNanoWatch s){
		s.start();
		for(long i=0;i<8000000000l;i++){
			
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	public static void execute(StopMilliWatch s){
		s.start();
		for(long i=0;i<5000000000l;i++){
			
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	public static void main(String[] args) {
		 StopWatchDemo swd=new StopWatchDemo(); // 인스턴스 메소드의 호출은 객체 생성으로  만약 execute가 static으로 메서드만들면 그냥 사용가능 ㅎㅎ
		 
		 
		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);
		
		StopNanoWatch s2 = new StopNanoWatch();
		swd.execute(s2);
		//execute의 오버로딩을 통해 정리해줌
		// 팀장님 조언:어떤 요규사항이 들오오면 클래스 만 추가해서 기능이 바뀌도록 만들어줘야한다. 결국고객의 요구가늘면(마이크로세컨즈) (문제1)또  execute를 추가 해야한다. 로직을 바꾸는 상황이생김
		//스탑 밀리워치의 공통점(공통분모를빼자)을 찾아 다형성을 높이고, 각각클래스에 측정부분도 데모에서 빼서 클래스로옮기자.  
		
	}
	
	
}

//상황에따라 main은바뀌면 안됨
//좀더 접근제어자와 기능에따라 캡슐화 클래스를묶어주자

//step4 시작 끝 시간을 상속으로 , 추상클래스 이용

