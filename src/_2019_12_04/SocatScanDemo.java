package _2019_12_04;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocatScanDemo {
public static void main(String[] args) {
	Socket socket =null;
	for(int i =21; i<=1024;i++){
		//socket에서 객체가 생성되었다는 의미는 host,port로 통신을 할 수 있다는것
		//이는 해당 호스트와 포트를 사용하고있다는 이야기이다.
		try {
			socket = new Socket("13.209.180.253",i); //22,80 포트가열려있다.
			System.err.println(i+"번호로 사용중입니다.");
			
		} catch (UnknownHostException e) {
			System.out.println(i+"호스트가 존재 하지않습니다.");
			
		}catch (IOException e){
			System.out.println(i+"번호로 사용하고있지않아요.");
		}
		
	}
}
}

