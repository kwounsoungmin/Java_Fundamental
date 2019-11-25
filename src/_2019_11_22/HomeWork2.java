package _2019_11_22;

import java.util.Scanner;

public class HomeWork2 {


    public static void main(String[] args) {
 
        /*
         * 숙제1) 문자 reverse 짝수&홀수 일때 1.input으로 "abcd"->"dcba"로나온다. 2.input으로
         * "abcde"-> "edcba"
         * 
         * sol) 1.toCharArray()문자열을 문자배열로 변환하는 메소드 를이용하여 분리한다. 2.짝수 문자열 ,홀수 문자열
         * 경우구분하여 배열의 인덱스 교환을 해준다. 이때 "temp"를 이용해 교환. 3.그렇게 교환된 배열을 출력한다.
         */
 
        String input;
        int loop = 0;
        while (loop != 2) {
            System.out.println("rever할 문자를 입력하세요:");
            Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성
            input = scan.nextLine(); // 키보드 문자 입력
            char[] ch = input.toCharArray();
            if ((ch.length % 2 == 0)) {
                char temp;
                temp = ch[3];
                ch[3] = ch[0];
                ch[0] = temp;
                char temp2;
                temp2 = ch[2];
                ch[2] = ch[1];
                ch[1] = temp2;
                System.out.println(ch);
 
            } else {
                char temp;
                temp = ch[4];
                ch[4] = ch[0];
                ch[0] = temp;
                char temp2;
                temp2 = ch[3];
                ch[3] = ch[1];
                ch[1] = temp2;
                System.out.println(ch);
            }
            loop++;
        }
 
        System.out.println("-----------------------------------------------------------");
        System.out.println("1-100까지의 소수를 구하시오.");
        /*
         * 숙제2) 1-100까지의 소수를 구하시오. ex)2,3,5,11,13... ->소수:자신보다 작은 두 개의 자연수를 곱하여
         * 만들 수 없는 1보다 큰 자연수이다(1은소수 No) sol)1.1~100까지의 소수 출력 합니다. 2. for문 이용
         * (2~100까지), 나눠지는게 1라도 있다 그럼 소수아냐 break나와 ex)4는 234중 나눠지는게 1라도 있다
         * break, 5는 234돌려도 없어 소수 배열에 저장 ,이중포문쓸때 두번째 for문에 윗 for문 i이용 3.구하는게 장땡이
         * 아니고 효율적으로 코딩 할것. 4. 마치 로또 예제처럼 중복체크해서 나눈 나머지가 하나 라도 있음(중복) 브레아크로
         * 빠져나자.-> 자신보다 작은 수로 나눠봐서 하나라도 나누어 떨어지면 소수 탈락!
         * 
         */
 
        int pri = 0;
 
        for (int i = 2; i <= 100; i++) // 1은 소수가 아니므로 2부터 시작
        {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    pri++;
                }
            }
 
            // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
            if (pri == 1) {
                System.out.print(i + " ");
            }
            pri = 0;
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------");
 
        /*
         * 숙제3) 달력 만들기 1. 1년1월 1일은 월요일 2. 1년은 365일, 윤년은 366일 ~2월 29일 3. 윤년은 4년마다
         * 발생하고 그중에서 100 배수는 제외하고 400 배수는 제외하지 않는다. 4. 2019년 12월 25일 무슨 요일 일까요?
         */
 
        int year, day, month;
        Scanner scanner = new Scanner(System.in);
        // 연,월,일을 입력받음
 
        System.out.println("연도를 입력하세요 : ");
        year = scanner.nextInt();
 
        System.out.println("월을 입력하세요 : ");
        month = scanner.nextInt();
 
        System.out.println("일을 입력하세요 : ");
        day = scanner.nextInt();
 
        PrintDay(year, month, day);
    }
 
    public static void PrintDay(int year, int month, int day) {
        char dayOfWeek = DayofDate(year, month, day);
        System.out.println(year + "년 " + month + "월 " + day + "일은 " + dayOfWeek + "요일입니다.");
 
    }
 
    public static int MonthDays(int year, int month) {
        int dayOfMonth = 0;
        // 윤년일 조건
        Boolean yunYear = ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
        // 31일 일 조건
        Boolean is31 = (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
                || (month == 12);
 
        if (yunYear && month == 2) {
            dayOfMonth = 29;
        } else if (!yunYear && month == 2) {
            dayOfMonth = 28;
        } else if (is31) {
            dayOfMonth = 31;
        } else {
            dayOfMonth = 30;
        }
        return dayOfMonth;
    }
 
    public static char DayofDate(int year, int month, int day) {
        char dayOfWeek = 0;
        int totalDay = 0;
        for (int i = 1900; i <= year; i++) {
            // 입력 년도 이전 까지는 12월 까지 다 더함
            if (i < year) {
                for (int j = 1; j <= 12; j++) {
                    totalDay += MonthDays(i, j);
                }
                // 입력 년도는 입력 월 이전까지 더함
            } else {
                for (int j = 1; j < month; j++) {
                    totalDay += MonthDays(i, j);
                }
            }
        }
        // 나머지 일 수를 구해진 전체 일수에 더함
        totalDay += day;
        // 기준일인 1900년 1월 1일이 월요일이므로
        switch (totalDay % 7) {
        case 0:
            dayOfWeek = '일';
            break;
        case 1:
            dayOfWeek = '월';
            break;
        case 2:
            dayOfWeek = '화';
            break;
        case 3:
            dayOfWeek = '수';
            break;
        case 4:
            dayOfWeek = '목';
            break;
        case 5:
            dayOfWeek = '금';
            break;
        case 6:
            dayOfWeek = '토';
            break;
        }
        return dayOfWeek;
    }
}
    