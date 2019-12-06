package _2019_12_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//주로 문자를읽고쓸때 사용 잘알아두자 readLine ()은 한줄의 개행이전까지만 읽어준다. \n(window) \r(리눅스)
//flush 가 필요없다!
//이코드가 문자 읽을때 제일많이써~ 
public class PrintWriteDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;
		
		try {
			fr = new FileReader("c:\\dev\\io\\2019\\12\\text1.txt");
			br = new BufferedReader(fr); //stream chaining,리드라인이편리 필터링해줌 
			
			fw = new FileWriter("c:\\dev\\io\\2019\\12\\text3.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			String readLine = null;
			
			while ((readLine = br.readLine())!=null){//값이있으면 들어와 널을리턴해라.
			pw.println(readLine);
				bw.write(readLine);
				bw.newLine();// 이게있어야 개행이발생 리드라인은 개행을 포함 안함!
				


			}
			bw.flush();//버퍼관련된건 플러쉬 넣주는 습관가지자!
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
				//if (fw != null)
				//	fw.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

