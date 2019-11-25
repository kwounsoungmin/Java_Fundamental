package _2019_11_19;

public class charLiteralDemo {

	public static void main(String[] args) {
//유니코드 표현방법
		char c1='\uCAD8';
		char c2='\uC601';
		char c3='\uCBBF';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
//아스키코드 표현방법
		//숫자 48~57(0~9)
		char n = 10; 
		char [] arr = new char[n];
		 arr[0]=48;
		 arr[1]=65;//A
		 arr[2]= 97;//a
		for(int i=0;i<3;i++){
			System.out.println(arr[i]);
		}
		double cas1=123;
		char t1='k', t2='나';
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("hello\n"+"wrold");
		System.out.println("hello\t"+"wrold");
		String path ="C:\\dev\\eclipse-jee-mars-R-win32-x86_64\\eclipse";
		//여기서 \은 바로인식안되 \\로써줘야 path 잘 들어가요
		System.out.println(path);
		System.out.println(cas1);
	}

}
