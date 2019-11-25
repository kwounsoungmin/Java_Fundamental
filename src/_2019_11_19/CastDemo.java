package _2019_11_19;

public class CastDemo {

	public static void main(String[] args) {
		
	

	//overflow발생하여 compile error발생
		//byte b1= 250;
		
		byte b1=(byte)129;
		System.out.println(b1);
		
		int i1=(int)125.35;
		System.out.println(i1);
	double d1= 124.5f; //auto casting ->작은걸 큰데 담을때
	 
	byte b2=10;
	byte b3=20;
	/*
	byte b3= b2+b3;
	//산술연산자는 반환값이 int 이기때문에 전체를 byte로 할 수없고.
	*/
	byte b5=(byte)(b2+b3);
	System.out.println(b5);

	int a1=10_000_000;//이런 식의 언더스코어넣주는걸 허용함
	}

}
