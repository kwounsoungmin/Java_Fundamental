package _2019_11_22;

public class Customer {
		//은행의 고객
		public  String name;
		//public  final String name=""; 이렇게 안써 ..
		public String email;
		public int age;
		public double balance;
		public boolean isReleased;
		
		public static double interestRate;
		//모두 신한은행을 사용 바뀔일 없어.
		//final 변수는 관례상 대문자 사용이 원칙이다.
		public static final String BANKNAME= "신한은행";
		

}
