package _2019_11_29;
//throw는 개발자가 예외 를인위적으로 발생 시키는 것이다.
public class TrowDemo {

	public static double Witdraw(String account,int amount)
			throws Exception{
		double myBalance= 10000;
		String myAccount ="123-123-123";
		if(myAccount.equals(account)){
			if(myBalance-amount>=0){
				myBalance -= amount;
			}else{
				throw new insufficientBalanceException("잔고가 부족합니다.");
			}
			
		}else{
			throw new InCorrectAccountException("계좌번호가 잘못되었습니다.");
			//Exception클래스 반드시 예외 처리하는클래스-> 사용자정의 예외 클래스 만들어 의미주자.
		}
		return myBalance;
		
	}

	public static void main(String[] args) {
		double balance = 0;
		try{
		balance = Witdraw("123-123-123", 100000);
		
		System.out.printf("인출후 잔고는 %.2f원 입니다.", balance);
		}catch (Exception e){
			System.err.println(e.getMessage());
		}

	}
}
