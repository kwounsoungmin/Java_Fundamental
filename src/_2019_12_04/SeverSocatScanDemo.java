package _2019_12_04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SeverSocatScanDemo {
	public static void main(String[] args) {
		ServerSocket serversoket = null; // 서버소켓은당연히 아이피가없다. 자기포트열어달란것이다.
		for (int i = 1; i <= 65536; i++) {
			// socket에서 객체가 생성되었다는 의미는 host,port로 통신을 할 수 있다는것
			// 이는 해당 호스트와 포트를 사용하고있다는 이야기이다.
			try {
				// 서버소캣클래스는 해당 서버의 포트번호를 사용할 수 있으ㅡ면
				// 서버소캣 객페를 사용할 수 있고, 그엏지 않으면 예외 발생
				// 즉 예외가발생한다면 해당 포트를 사용하고있다응 의미
				serversoket = new ServerSocket(i); // 135는이미 사용중이라 에러발생
				System.err.println(i + "번호로 사용할수있습니다.");

			} catch (IOException e) {
				System.err.println(i + "번호를 사용할 수 없습니다..");
			}

		}
	}
}
