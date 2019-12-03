package _2019_12_03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		// html 문서전체를 관리하기위한 객체이다.
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공"); // 연결됨
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements elements = doc.select(".con-wrap.notice-wrap"); // Elements전체
																	// elements
																	// h3구성
		Elements titleElements = elements.select("h3");
		String noticeTitle = titleElements.text();
		System.out.println(noticeTitle);

		Elements liElements = elements.select(".notice-list ul li");
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}

	}
}
