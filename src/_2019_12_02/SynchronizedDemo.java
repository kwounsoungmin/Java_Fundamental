package _2019_12_02;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;

	// 같은 객체면 이값을 공유 해버림-> 스레드를 안전하게 만들려면 인스턴스 변수 사용하면안됨
	@Override
	public synchronized void run() { // 두 스레드가 같은 객체를 공유할때만 synchronized 블록을
										// 이용하여 안정적값을낼수 있다.
		// 첫스레드 1000돌리고 두번쨰 스레드 돌린다 서로 주고 받지 않게 만든다. 서로 주도권을 빼앗기지 않는다.
		// 임계영역 :중요한 값이라 다중수행시 안정적으로 수행해야할 영역
		for (int i = 0; i < 1000; i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x:%d, y:%d - %s%n", x, y, threadName);
			System.out.printf("%s : %d ", threadName, i);
		}
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);

		t1.start();
		t2.start();

		// sleep메소드는 밀리초로 아두이노 코드처럼 1000 =1초 대기해줄수 있다.~
		// 5초에한번식 위에 for루프를돈다.
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(s1).start();
		}
		
		
	}

}
