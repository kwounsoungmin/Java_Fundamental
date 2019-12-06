package _2019_12_03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
	public static void main(String[] args) {
		String url = "https://m.sports.naver.com/";
		
		// html 문서전체를 관리하기위한 객체이다.
		Document doc = null;
		Document doc2 =null;
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("연결 성공"); // 연결됨
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements elements = doc.select("article_group"); // Elements전체
		Elements liElements = elements.select(".article_group a");
		System.out.println(elements.isEmpty());
				String contrnt = elements.text();
		
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}

	}
}

