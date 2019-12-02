package _2019_12_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputstreamDemo {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\pdf3.zip");
			bos = new BufferedOutputStream(fos);
			// 버퍼드인풋아웃분 스트링으로하는법 (아래주석)--궂이 이렇게 할 이득없다.

			/*
			 * int readByte = 0; long start = System.currentTimeMillis();
			 * 
			 * // 읽고씀(1024바이트 읽어 // readBytes에 저장하고 // 읽은바이트수를반환.)
			 * 
			 * 
			 * while((readByte=bis.read()) !=-1){//-1은 배열의 빈공간을 의미
			 * //fos.write(readBytes, 0,readByCount):readBytes바이트 //배열에있는 데이터를
			 * 출력하되 처음부터 )readByteCount 만큼 출력 bos.write(readByte);//(이만큼을
			 * ,0부터,얼마까지) } bos.flush(); //꼭까먹지말고 하자. long end
			 * =System.currentTimeMillis();
			 * System.out.printf("경과시간:%d",end-start);
			 */

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
				if (fos != null)
					fos.close();
				if (bos != null) // 객체가 생성이됬으면 크롤우즈
					bos.close();
//닫는순서 유의 하기 안에꺼 닫고 밖에꺼닫고!~
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// 꽉찬건보내고 나머진안보내서 짤리니까 flush작업을해야함.

// 결론 바이너리 코드를 쓰는거는 바이트 배열 을 하는게 제일 좋다.빠르고 간결함.(버퍼나 체인스트링하는것보다)