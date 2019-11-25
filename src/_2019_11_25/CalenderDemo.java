/*package _2019_11_25;

public class CalenderDemo {
	private int year;
	private int month;
	private int day;
	private int totalCount;
	static int monthArr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;

	}

	public int getTotalCount() {
		int prey = year - 1; // 2018년도
		int premonth = month - 1; // 2018년도 11월
		// int totalcount= 0;
		// 2018년도까지 총이 수 구하기
		totalcount = prey * 364 + (prey / 4 - prey / 100 + prey / 400);
		// 2019년도가 윤년인지 판단
		boolean isLef = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		if (isLef) {
			monthArr[1] = 29;
		}
		for (int i = 0; i < premonth; i++) {
			totalcount += monthArr[i];
		}
		totalcount += day;

		return totalcount;
	}

	public void print(int count) {
		String massege = null;
	//	int totalDay = totalcount % 7;
		switch (totalDay % 7) {
		case 0:
			totalDay = '일';
			break;
		case 1:
			totalDay = '월';
			break;
		case 2:
			totalDay = '화';
			break;
		case 3:
			totalDay = '수';
			break;
		case 4:
			totalDay = '목';
			break;
		case 5:
			totalDay = '금';
			break;
		case 6:
			totalDay = '토';
			break;
	//		System.out.printf();
		}
	}
//메인에는 로직을 넣지 말자 실행문만넣자  로직들을 분리하는 실력을 키우자
	public static void main(String[] args) {
		CalenderDemo c = new CalenderDemo();
		c.set(2019, 12, 25);
		c.getTotalCount();
		//c.print();
	}
}
*/