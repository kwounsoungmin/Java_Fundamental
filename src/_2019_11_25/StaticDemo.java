package _2019_11_25;

public class StaticDemo {

	
		static String name;
		int age;
		
		public void m1(){// 다 사용가능!  
			name ="kwon";//instance메서드에서는 static 변수 의 사용이 가능!
			age=25;//인스턴스 메서드에서는 인스턴스 메서드 당연히 호출가능
			m2();//인스턴스 메서드에서는 인스턴스 메서드 당연히 호출가능
			m4();//인스턴스 메서드에서는 static 메서드 \ 호출가능
		}
		public void m2(){
			System.out.println("instance method  m2() call!");
		}
		//static 
		public static void m3(){
			name ="soung"; //static메서드에서 static변수 사용 가능
			//age=10;		//static 메서드 에서 인스턴스 메서드 호풀 불가
			//m2();		//static메서드에서 인스턴스 메서드 호출은 불가하나 (궂이 써야겠다면)new로 객체 생성시 가능!
			m4();//인스턴스 메서드에서 스테틱 메서드 호출가능
			//new 로 객체를 생성하여 사용 가능함.인스턴스 메서드와 변수를 사용하기위해 new 함.
			StaticDemo sd = new StaticDemo();
			sd.age=10;
			sd.m2();
			
		}
		
		public static void m4(){
			System.out.println("instance method  m4() call!");
		}
		
		

}
