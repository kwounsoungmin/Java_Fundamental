package _2019_12_02;

public class ThreadDemo extends Thread {
	public ThreadDemo(String threadName){
		super(threadName);
		
	}
	public void run(){
		for(int i=0; i<100000;i++)
		{
			String threadName =Thread.currentThread().getName();
			System.out.printf("%s : %d %n",threadName,i);
		}
	}
	//메인하고 별도로 진행되는걸 이해해야해! end나왔으니 메인 다 나온거지, run은 은 또 계속돌아감 
	public static void main(String[] args) {
		//스레드 객체를 생성하는 방법
		//1.Thread 클래스를 상송 받는다.
		//2.run 메서도를 오버라이딩한다.
		//3.해당 객체를 생성한다. ->스레드데모객체를 의미
		//4.해당 객체로 start 메서드를 호출한다.
		System.out.println("****************start********************");
		ThreadDemo t1 =new ThreadDemo("스레드1 ");
		t1.start();
		//여기서 멈추지 않고 흘러가는게 포인트 메인이끝나도 내부의 프로그램은 돌아가고있다.
		//예측이불가능하여 어렵다.
		//결국스레드도 라이프사이클이있고 주고받으며 주도권을줄뿐 결국 프로그램은 한줄실실행한다.
		//이 번갈아주느것은스케쥴러가 관리한다.
		ThreadDemo t2 = new ThreadDemo("스레드 2");
		t2.start();
		System.out.println("****************end********************");
		
		
	}
	

	
}
