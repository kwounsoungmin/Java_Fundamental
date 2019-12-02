package _2019_12_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1바이트씩 읽고 저장
public class FileInputStringDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\java.exe");
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\java1.exe");
			int readByte = 0;
			// fis.read() :한바이트 읽어서 반환한다. 더이상 읽을 바이트가없으면 -1 반환
			while ((readByte = fis.read()) != -1) {
				// fos.write() 한바이트쓰기
				fos.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)//객체가 생성이됬으면 크롤우즈
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
