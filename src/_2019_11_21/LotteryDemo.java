package _2019_11_21;

public class LotteryDemo {

	public static void main(String[] args) {
		//로또 번호가 나오게 만들어보자~
		//Math.random(): 메스클레스의 랜덤메소드를 이용하여  0보다크고 1보다작은 더블값의 난수를 반환하는 성질을 이용하자.
		int[] lotto =new int [6];
		//15-20라인까지는 i인덱스 이전까지 값을 체크한다.
		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random(); //반환값이 더블 변수의 데이터타입도 더블
			int temp =(int)(random*45)+1;// 로또 번호 1~45까지임,
			
			lotto[i]=temp;
			
			if(temp!=lotto[i]){
					lotto[i]=temp;
			}
			else{
				
				lotto[i]=temp%7+1;
				
				
			}
		}
		
			
			for(int k=0;k<lotto.length-1;k++){
				for(int h=0;h<lotto.length-1-k;h++){
					if(lotto[h]>lotto[h+1]){
						int t=lotto[h];
						lotto[h]=lotto[h+1];
						lotto[h+1]=t;
						
					}
				
					
				}
					
			}
		
			for(int j:lotto){
				System.out.print(j+"\t");
			}
			
			
	}

}
