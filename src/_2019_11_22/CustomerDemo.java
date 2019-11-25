package _2019_11_22;

public class CustomerDemo {

	public static void main(String[] args) {
	
	
		Customer c1 =new Customer();
		c1.name="권성민";
		c1.email="mob0317@naver.com";
		
		Customer c2= new Customer();
		
		c2.name="펄수";
		c2.email="mob0317@naver.com";
		Customer c3= new Customer();
		
		c3.name="영희";
		c3.email="mob0317@naver.com";

	for(int i=0; i<3;i++){
		if(i==0){
		System.out.println(c1.name);
		System.out.println(c1.email);
		}else if(i==1){
			System.out.println(c1.name);
			System.out.println(c1.email);
		}
			else{
				System.out.println(c1.name);
				System.out.println(c1.email);
			}
				
		
	}
	
		//가능은 하나 이 방법은 좋지 못하다.,접근은가능하나 좋지못해 노란줄뜨지.
	//	c3.interestRate= 10.2;
	//	System.out.println(c3.interestRate);
		
		//이렇게 접근해야 올바르다!
		Customer.interestRate=12.2;
		System.out.println(Customer.interestRate);
		
		//static final인 이변수는 BANKNAME은 상수로 변경불가.//FINAL은 상수, 변수 수정불가능
	//	Customer.BANKNAME="국민은행"; //    이러면 안됨.. 못바꿔
	
		//String a= new String ("abcd");
		
		//a.='z';
		
		Customer c4= c3; // 가능하다 참조형이니까
		c4.name = "잡스형님";
		System.out.println(c4.name);
		
		Customer c5= new Customer();
		c5.name ="손정의";
		c5.email = "Masayosi@yahoo.co.jp";
		System.out.println(c2==c5);// 다르다.
		System.out.println(c3==c4); //같다.
	}

}
