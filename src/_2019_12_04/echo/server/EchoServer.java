package _2019_12_04.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
	private int port;
	BufferedWriter bw =null;
	BufferedReader br = null;
	
	public EchoServer(int port){
		this.port = port;
	}
	
	public void run(){
		ServerSocket serverSocket = null;
		try {
			//1. ServerSocket 객체를 생성한다.
			serverSocket = new ServerSocket(port);
			
			while(true){
				System.out.println("클라이언트 접속을 기다리고 있습니다.");
				//accept() 메서드는 클라이언트 접속을 기다리다 클라이언트가 접속하면
				//클라이언트와 통신할 수 있는 Socket 객체를 반환한다.
				//2. 서버소켓으로 클라이언트의 접속을 기다린다.
				//5. 클라이언트와 통신할 수 있는 소켓 객체를 반환한다.
				Socket socket = serverSocket.accept();
				
				System.out.println("클라이언트가 접속했습니다. ip: "+socket.getInetAddress().getHostAddress());
				//7. 소켓으로 입력스트림을 생성한다.
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
				
				//8. 소켓으로 출력스트림을 생성한다.
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//자동적으로 닫힘. 크롤우즈할 방법이없다.
		}
	}
	
	public static void main(String[] args) {
		new EchoServer(3000).run();
	}
}
