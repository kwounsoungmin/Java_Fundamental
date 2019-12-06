package _2019_12_03;
//네트웍을 읽어서 파일로 저장.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStream in = System.in;// 소스(source)가 키보드인 경우
		InputStreamReader isr = null;
		BufferedReader br = null;
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		
		try {
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				if (readLine.equals("exit"))
					break;
				System.out.println(readLine);
				System.out.println("입력하세요>");

			}
			// String readLine = br.readLine();// 키보드 입력을 기다리다 엔터를 치면 읽는다.

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
				if (br != null)
					br.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
