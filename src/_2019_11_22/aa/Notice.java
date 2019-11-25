package _2019_11_22.aa;

public class Notice {

	public int number;
	protected String title;
	int hit;
	private String regdate;

	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.title = "title";

		n.hit = 100;
		//같은 클레스 내부에서는 심지어 private protected역시 객체를생성해서 그 객체 멤버변수에 접근이 가능핟.
		n.regdate = "2019.11.21";

	}
}
