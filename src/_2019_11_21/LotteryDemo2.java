package _2019_11_21;

public class LotteryDemo2 {

	public static void main(String[] args) {
		//로또 번호가 나오게 만들어보자~
		//Math.random(): 메스클레스의 랜덤메소드를 이용하여  0보다크고 1보다작은 더블값의 난수를 반환하는 성질을 이용하자.
		int[] lotto =new int [6];
		//15-20라인까지는 i인덱스 이전까지 값을 체크한다.
		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random(); //반환값이 더블 변수의 데이터타입도 더블
			int temp =(int)(random*45)+1;// 로또 번호 1~45까지임,
			//무조건 temp값을 집어 넣는다. 만약 중복이 되면 i를 증가시키지 않고 그자리에 다시 새로운 낫를 받아넣는 식으로 중복을 피해준다.
			lotto[i]=temp;
			for(int j=0;j<i;j++){
				if(lotto[j]== temp){
					i--;
					break;
					
				}
			}

	}
		//오름차순 정렬
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
			//home practice
		}
}
}


