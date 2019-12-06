package _2019_12_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
try {
	fr = new FileReader("c:\\dev\\io\\2019\\12\\text1.txt");
	fw = new FileWriter("c:\\dev\\io\\2019\\12\\text2.txt");
	
	int readChar =0;
	while((readChar=fr.read())!=-1){
		System.out.print((char)readChar);
		fw.write(readChar);
		
	}
} catch (FileNotFoundException e) {
	e.printStackTrace();
}catch (IOException e){
	e.printStackTrace();
}finally{
		try {
			if(fw!=null)
					fw.close();
				if(fr!=null)
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	}

	}

