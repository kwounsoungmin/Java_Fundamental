package _2019_12_04.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;



public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port){
		this.ip = ip;
		this.port = port;
	}
	public void run(){
		Socket socket = null;
		OutputStream out =null;
		OutputStreamWriter osw =null;
		BufferedWriter bw =null;
		BufferedReader br =null;
		try {
			//3. 소켓객체를 생성한다.
			//4. 서버와 연결을 한다.
			socket = new Socket(ip,port);
			//6. 소켓으로 출력스트림을 생성한다.
			
			bw.write("안녕하세요!");
			bw.newLine();
			bw.flush();
			
			//9. 소켓으로 입력 스트림을 생성한다.
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			
			String readLine = br.readLine();
			System.out.println(readLine);
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			if(out!=null)out.close();
			if(bw !=null) bw.close();
			if(br !=null) br.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
			
		}
	}
	public static void main(String[] args) {
		new EchoClient("192.168.0.203",3000).run();
	}
}



