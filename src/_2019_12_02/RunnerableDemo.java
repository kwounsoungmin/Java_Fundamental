/*package _2019_12_02;

public class RunnerableDemo implements Runnable {
	// 추상메소드이기에 ㅂ반드시 런메소드 오버라이딩해주자 run쓰고 ctrl +sapce
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d %n", threadName, i);
		}

	}

	public static void main(String[] args) {

		System.out.println("****************start********************");

		// RunnableDemo r1 =new RunnableDemo();
		Thread t1 = new Thread(r1, "스레드1 ");
		t1.start();
		// 여기서 멈추지 않고 흘러가는게 포인트 메인이끝나도 내부의 프로그램은 돌아가고있다.
		// 예측이불가능하여 어렵다.
		// 결국스레드도 라이프사이클이있고 주고받으며 주도권을줄뿐 결국 프로그램은 한줄실실행한다.
		// 이 번갈아주느것은스케쥴러가 관리한다.
		// RunnableDemo r2 =new RunnableDemo();
		Thread t2 = new Thread(r2, "스레드1 ");
		t2.start();
		System.out.println("****************end********************");

	}
}
*/