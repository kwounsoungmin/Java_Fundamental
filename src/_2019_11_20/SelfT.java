package _2019_11_20;

public class SelfT {
public static void main(String[] args) {
	
	System.out.println("이쁜 별만들기");
	int i, t;
	for (i = 0; i < 5; i++) {
			for (t = 0; t< 5-i; t++) {
			
			System.out.printf(" ");
		}
		for (t = 0; t<i*2-1; t++) {
			
			System.out.printf("*");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
}

