package _2019_12_02;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
//이걸꼭암기 이게 helloworld임
	//1바이트씩 읽고 저장
	public class FileTestByte {

		public static void main(String[] args) {
			FileOutputStream fos = null;
			FileInputStream fis = null;
			try {
				fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\java1.exe");
				fis = new FileInputStream("c:\\dev\\io\\2019\\12\\java.exe");
				int readByte = 0;// null일때 -1반환을위해
				
				byte[]  readBytes=new byte[1024*10]; //10(8-10이문안함)키로바이트씩 일고씀(1024바이트 읽어서 readBytes에 저장하고 읽은바이트수를반환.)
				int readByteCount=0;//1바이트짜리를끊어넣을떄
				
				long start =System.currentTimeMillis();
				while((readByteCount=fis.read(readBytes)) !=-1){//-1은 배열의 빈공간을 의미
					//fos.write(readBytes, 0,readByCount):readBytes바이트
					//배열에있는 데이터를 출력하되 처음부터 )readByteCount 만큼 출력
					fos.write(readBytes,0,readByteCount);//(이만큼을 ,0부터,얼마까지)
				}
				long end =System.currentTimeMillis();
				System.out.printf("경과시간:%d",end-start);
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