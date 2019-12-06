package _2019_12_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;



public class UrlDemo {
	public static void main(String[] args) 
			throws IOException {
		
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0004340528");
		//URL클래스 의 기능 1 주소의 프로토콜 호스트 등등이 리턴되어 보여줌 없으면 -1을 받아낸다., 서버의 url정보를 얻어온다.
		
		String protocol =url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println(protocol);
		System.out.println(host);
		System.out.println(port);
		System.out.println(path);
		System.out.println(query);
		System.out.println(ref);
		
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine =null;
		while((readLine=br.readLine())!=null){
			System.out.println(readLine);
		}
		
		
		
		
		
		
		

	}
}
