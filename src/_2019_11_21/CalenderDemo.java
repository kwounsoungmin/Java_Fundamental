package _2019_11_21;
import java.util.Scanner;
public class CalenderDemo {
	
	public static void main(String[] args) {
	
		
		/* 달력 만들기
		 * 1.  1년1월 1일은 월요일
		 * 2.  1년은 365일, 윤년은 366일 ~2월 29일
		 * 3.  윤년은 4년마다 발생하고 그중에서 100 배수는 제외하고 400 배수는 제외하지 않는다.
		 * 4.  2019년 12월 25일  무슨 요일 일까요?
		 */
		
		int year=2019, month= 12, day=25;
		String message = null;
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};// 1~12달 의 수day
	
				//coding
		//윤년의 조건(4의배수o, 100배수 x, 400배수o)
	int prey= year-1; //2018년도
	int premonth = month-1; //2018년도 11월
	int totalcount= 0;
	//2018년도까지 총이 수 구하기
	totalcount = prey *364+(prey/4 - prey/100 +prey/400);
	//2019년도가 윤년인지 판단
		if(year%4==0 &&year %100!=0|| year %400 ==0)
			monthArray[1]=29;
		
		System.out.printf("%d년 %d월 %d일  %s 입니다.",year,month,day,message);
		System.out.println();

	}
}
//이전년의 총 월 일 수를 구햐해 토탈 카운트 구하는것 이관건
/*
public class Calendar {
 
    static int year;
    static int month;
    static int day;
    static int ansYoil = 0;
    static Scanner scan = new Scanner(System.in);
    static int monthArr[] = {31,28,31,30,31,30,31,31,30,31,30,31};        
    static String tmp;
    static char arr[];

       
        lunarCalendar LC = new lunarCalendar();
 
        System.out.println("xxxx년 xx월 xx일 양식으로 입력해주세요.");
        System.out.println("ex :: 2016년 02월 01일");
        getValue(); // 년 월 일 받아온다.
        
        // 윤년 검증 
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            monthArr[1] = 29; //윤년이 아닐 때
         
        else
            monthArr[1] = 28; //윤년
            
        
        // 01년 01월 01일부터 일수 계산
        day += (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100  + (year - 1) / 400;
         //2019년도 11월까지 합 구하기
        for (int i = 0; i < month - 1; i++)
            day += monthArr[i];
            
       ansYoil = day % 7;
       
       switch(ansYoil)
       {
          case 0:
               {System.out.print("일요일, "); break;}
 
           case 1:
               {System.out.print("월요일, "); break;}
 
           case 2:
               {System.out.print("화요일, "); break;}
 
           case 3:
               {System.out.print("수요일, "); break;}
 
           case 4:
               {System.out.print("목요일, "); break;}
 
           case 5:
               {System.out.print("금요일, "); break;}
           
           case 6:
               {System.out.print("토요일, "); break;}
       }
 
        ((lunarCalendar) LC).getLunar(tmp);
    }
 
    
    private static void getValue() 
    {
 
        char tmpYear[] = new char[4];
        char tmpMonth[] = new char[2];
        char tmpDay[] = new char[2];
        int k;
        
        String sTmp;
        
        // 값을 입력 받는다.
        tmp = scan.nextLine();        
       
        // 값을 배열로 바꾼다.
        arr = tmp.toCharArray();
        
        // 년도를 문자에서 숫자로 변환
        for(k = 0; k < 4; k++)
        {
            if( '0' <= arr[k] && arr[k] <= '9')
            tmpYear[k] = arr[k];
            
            // 년도를 잘못 기입할 때 예외처리
            else
            {
                System.out.println("년도에 숫자가 아닌 다른 문자가 있습니다. 다시 입력하세요.");
                getValue();
                return;
            }
        }
        
        // 한글 '년'을 잘못 입력할 때 예외처리
        if(!tmp.substring(4, 5).equals("년"))
        {
            System.out.println("'년' 입력이 잘못되었습니다. 다시 입력하세요.");
            getValue();
            return;
        }
        
        sTmp = new String(tmpYear);        
        year = Integer.parseInt(sTmp);
        
        // 월을 문자에서 숫자로 변환
        for(k = 6; k < 8; k++)
        {
            if('0' <= arr[k] && arr[k] <= '9')                
                tmpMonth[k-6] = arr[k];
            
            // 월을 잘못 기입할 때 예외처리
            else
            {
                System.out.println("월에 숫자가 아닌 다른 문자가 있습니다. 다시 입력하세요.");
                getValue();
                return;
            }
        }
        
        // 한글 '월'을 잘못 입력할 때 예외처리
        if(!tmp.substring(8, 9).equals("월"))
        {
            System.out.println("'월' 입력이 잘못되었습니다. 다시 입력하세요.");
            getValue();
            return;
        }
        
        sTmp = new String(tmpMonth);
        month = Integer.parseInt(sTmp);
        
 
        // 일을 문자에서 숫자로 변환
        for(k = 10; k < 12 ; k++)
        {
            if('0' <= arr[k] && arr[k] <= '9')
                tmpDay[k-10] = arr[k];
        
            // 일을 잘못 기입할 때 예외처리
            else
            {
                System.out.println("일에 숫자가 아닌 다른 문자가 있습니다. 다시 입력하세요.");
                getValue();
                return;
            }            
        }
        
        // 한글 '일'을 잘못 입력할 때 예외처리
        if(!tmp.substring(12, 13).equals("일"))
        {
            System.out.println("'일' 입력이 잘못되었습니다. 다시 입력하세요.");
            getValue();
            return;
        }
        
        sTmp = new String(tmpDay);
        day = Integer.parseInt(sTmp);
        
        
        if (year < 1 || (month < 1 || month > 12) || (day < 1 || day > 31)) 
        {
            System.out.println("년, 월, 일중 맞지 않은 값이 있습니다. 다시 입력하세요.");
            getValue();
            return;
        }        
 
    }
 
 
}
}
*/
