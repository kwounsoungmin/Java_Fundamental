package _2019_12_04;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress i = InetAddress.getLocalHost();
		//도메인을 알면 아이피주소나 도메인을 끄집어올 수 있다.
		
		System.out.printf("호스트 이름:%s %n",i .getHostAddress());
		
		System.out.printf("ip address :%s %n ",i.getHostAddress());
		
		InetAddress i1 = InetAddress.getByName("naver.com");
		//도메인을 알면 아이피주소나 도메인을 끄집어올 수 있다.
		
		System.out.printf("호스트 이름:%s %n",i1 .getHostAddress());
		
		System.out.printf("ip address :%s %n ",i1.getHostAddress());
		
		
	}
}
