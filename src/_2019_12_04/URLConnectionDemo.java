package _2019_12_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0004340528");

		URLConnection urlcon = url.openConnection();

		String cacheControl = urlcon.getHeaderField("cache-control");
		String contentType = urlcon.getHeaderField("cache-type");
		System.out.println(cacheControl);
		System.out.println(contentType);

		InputStream in = urlcon.getInputStream();// 헤더 쪽
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);

		}
	}
}
