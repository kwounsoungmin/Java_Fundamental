package _2019_12_05.unicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class UnicastServerThread implements Runnable {
	private Socket socket;
	public UnicastServerThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			//InputStream in = socket.getInputStream();
			//InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			
			
			//OutputStream out = socket.getOutputStream();
			//OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter bw = 
					new BufferedWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			boolean isStop = false;
			
			while(!isStop){
				String readLine = br.readLine();
				System.out.println(readLine);
				if(readLine.equals("exit")){
						isStop = true;
				}
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				
			}
			System.out.println("클라이언트가 정상정으로 종료했습니다...");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("클라이언트가 정상정으로 종료했습니다...");
			
		}
		
	}
}






