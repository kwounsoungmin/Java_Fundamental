package _2019_12_05.file.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import _2019_12_05.unicast.server.UnicastServerThread;

public class FileServer {
	
	private int port;
	public FileServer(int port){
		this.port=port;
		
	}
	public void run(){
		ServerSocket serversocket =null;
		try {
			
			while(true){
				System.out.println("클라이언트 접속 대기중...");
				Socket socket = serversocket.accept();
				System.out.println("클라이언트 IP : "+
						socket.getInetAddress().getHostAddress());
				 UnicastServerThread fst = new UnicastServerThread(socket);
				Thread t = new Thread(fst);
				t.start();
			}
		} catch (IOException e) {
						// TODO Auto-generated catch block
			e.printStackTrace();
		}
						//in,out은 네트워크에 받아오는건 로컬에서 받아오도록
		
	}
	public static void main(String[] args) {
		new FileServer(3033).run();
	}

}
