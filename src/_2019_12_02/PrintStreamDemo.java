package _2019_12_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out; // destination을 출력장치(모니터 에 출력)로 연결한다는의미.
		ps.println("Hello World!");

		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		PrintStream ps1 =null;

		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\pdf3.zip");
			bos = new BufferedOutputStream(fos);
			// 버퍼드인풋아웃분 스트링으로하는법 (아래주석)--궂이 이렇게 할 이득없다.
			ps1 = new PrintStream(bos, true);// destination을 파일로 연결한다는의미.(파일생성)
			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8];
			long start = System.currentTimeMillis();
			while ((readByteCount = fis.read(readBytes)) != -1) {// -1은 배열의 빈공간을
																	// 의미
				// fos.write(readBytes, 0,readByCount):readBytes바이트
				// 배열에있는 데이터를 출력하되 처음부터 )readByteCount 만큼 출력
				fos.write(readBytes, 0, readByteCount);// (이만큼을 ,0부터,얼마까지)
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간:%d", end - start);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fis != null) // 객체가 생성이됬으면 크롤우즈, 아니면 하지말아라.
					fis.close();
				if (bis != null) // 객체가 생성이됬으면 크롤우즈
					bis.close();
				if(ps1 !=null)
					ps1.close();
				if (fos != null)
					fos.close();
				if (bos != null) // 객체가 생성이됬으면 크롤우즈
					bos.close();
				
				
				// 닫는순서 유의 하기 안에꺼 닫고 밖에꺼닫고!~
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
