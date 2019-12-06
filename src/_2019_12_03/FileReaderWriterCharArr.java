package _2019_12_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterCharArr {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("c:\\dev\\io\\2019\\12\\text1.txt");
			fw = new FileWriter("c:\\dev\\io\\2019\\12\\text2.txt");
			/*
			 * int readChar =0; while((readChar=fr.read())!=-1){
			 * System.out.print((char)readChar); fw.write(readChar);
			 * 
			 * }
			 */

			char[] readchars = new char[100]; // char 배열 10개씩 읽고 넘겨
			int readCharCount = 0;
			while ((readCharCount = fr.read(readchars)) != -1) {
				System.out.print(new String(readchars, 0, readCharCount));//->콘솔에 출력할때
				fw.write(readchars, 0, readCharCount); // -> 이럴경우 읽은 수만큼쓰질못해.
				//fw.write(new String(readchars, 0, readCharCount));
				
				
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
