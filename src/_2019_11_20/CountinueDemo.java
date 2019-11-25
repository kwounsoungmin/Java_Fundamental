package _2019_11_20;

public class CountinueDemo {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i = 0; i < 10; i++) {
			if(i==6) continue;
			sum+=i;
		}
		System.out.println(sum);
		//continue문 이하를 실행하고싶지 않을때 else 쓰면 번거로울때 가능~
	}

}
