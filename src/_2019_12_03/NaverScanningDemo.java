package _2019_12_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

//1.InputStream을 InputStreamReader로 스트림 체이닝한다.
//2.InputStreamReader를 BufferedReader로 스트림 체이닝한다.
//3.BufferedReader 로 읽은 정보(html)를 "c:\\dev\\io\\2019\\12\\naver.html"
//파일로 저장한다.

public class NaverScanningDemo {
	public static void main(String[] args) 
			throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw= null;
		InputStreamReader ir =null;
		URL url = new URL("https://www.naver.com/"); //네이버의 html소스를땡겨옴
		InputStream in= url.openStream();
		
		
		ir = new InputStreamReader(in);
		br =new BufferedReader(ir);
		
		fw=new FileWriter("c:\\dev\\io\\2019\\12\\naver.html");
		bw=new BufferedWriter(fw);
		pw=new PrintWriter(bw,true);
		
		String readLine = null;
		while ((readLine = br.readLine())!=null){//값이있으면 들어와 널을리턴해라.
			bw.write(readLine);
			bw.newLine();// 이게있어야 개행이발생 리드라인은 개행을 포함 안함!
			pw.println(readLine);
		
	
		}
	}
}


