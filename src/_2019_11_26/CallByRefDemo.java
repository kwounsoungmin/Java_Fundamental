package _2019_11_26;

public class CallByRefDemo {
public static void change(int i,int[] j,String str){ //int i =a, int[] j=b
	System.out.println(i);//-> 10나옴.
	i=20;
	j[3]=400;
	str += "123";
	
}
	public static void main(String[] args) {
		int a=10;
		int b[]={1,2,3,4};
		
		String str ="abc";
		
		//change(a,b); //a=> call by value, b=>cll by reference
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		//call by ref시 값의 변동이있으니 주의하고 call by val은 값을 보내주고 원래값을 가지고있으니  영향주지 못함 주의.
		int[] c;
		c= new int[4];
		
		int[] d=null;
		System.out.println(d);
		d= new int[4];
		
		int age;
	//	int t=age+20; 
		//int age
		age=10;
		

	}

}
