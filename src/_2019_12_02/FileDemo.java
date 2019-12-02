package _2019_12_02;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//파일클래스 사용예제
public class FileDemo {
	public static void main(String[] args) {
		//폴더 만들기!
		File f1 = new File("c:\\dev\\io\\2019\\12");
		boolean isSuccess = f1.mkdirs();//mkdirs() 디렉토리를만들었느냐(존재 유무) ,이미 있으면 안만듬 , mkdir()는 디렉토리 1개만만듬! 주의
		System.out.println(isSuccess);
		
		
		//f1은 경로로 "c:\\dev\\io\\2019\\12" 를의미
		//파일 생성자 3가지 ppt에 내용알기 f1.getName()할필요 없이 그냥 f1쓰자
		File f2 = new File(f1,"Git-2.24.0.2-64-bit.exe");
		long fileSize = f2.length();
		System.out.println(fileSize);
		
		long lasfModified = f2.lastModified();//마지막수정한날자를 밀리세컨즈로 반환 ~
		Calendar c = Calendar.getInstance();
		// 이클래스는 new안함 추상 클래스 getInstance() 로 자식에서 new 한것.
		c.setTimeInMillis(lasfModified);//밀리세컨즈로 선언해주먄
		//c.setTime(System.currentTimeMillis()); //25행이실행된시간.
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;//month는 월을 0,1,2,3하여 12월은 11+1 해야 12나옴
		int day=c.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 %n",year,month,day);
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyy-mm-dd a hh:mm:ss E요일");//마지막수정날자 년 (a오전오후) 시분초  (E요일)
		String date =sdf.format(c.getTime());//d
		System.out.println(date);
		
		File f3 = new File("c:\\");
		//list() 메소드는 : c드라이브에 있는 모든 파일과 디렉토리를 String[] 배열로 반환

		String[] list = f3.list();
		for(String Temp: list){
			File f4= new File(f3,Temp);
			if(f4.isDirectory()){
				System.out.println("디렉토리: "+Temp);
			}else if(f4.isFile()){
				System.out.println("파일:"+Temp);
				
			}
			else
				System.out.println("?:"+Temp);
			System.out.println(Temp);
			
		}
		//파일 이름바꾸기
		File f5 =new File(f1,"java.exe");
		f2.renameTo(f5);
		
		//파일만들기 쓰지는말자.
		File f6= new File(f1,"a.text");
		try {
			f6.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f6.getName()); //파일이름가져오기
		System.out.println(f6.getPath());//파일이름을포함한 전체경로 출력
		System.out.println(f6.getParent());//부모의 경로 만보여줘
		//a.text를 System.currentTimeMillis().text파일롤바꿔보기
		//이고꼭외우기
	String extension =f6.getName().substring(f6.getName().lastIndexOf("."));
		File f7 =new File(f1,System.currentTimeMillis()+extension);
		f6.renameTo(f7);
		System.out.println(extension);
		
		f7.delete();
		
	}
}
