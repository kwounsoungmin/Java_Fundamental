package _2019_11_22.aa;

public class NoticeDemo {

	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.title = "title";

		n.hit = 100;
		
		//이경우에 같은 페키지 내에서는 private은 접근불가이다!
	//	n.regdate = "2019.11.21";
	}

}
