package _2019_12_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		Document doc = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20171101&end=20191203";

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Elements elements = doc.select(".cmc-table__table-wrapper-outer table tbody tr"); // css
																							// 를검색해야
																							// 알겠지?
																							// 큰
																							// 범주
																							// 묶인거
																							// 찾아서
																							// 넣기
		try {
			System.out.println("Date\tOpen\tHigh\tLow\tClose\tVolume\tCap");
			// c:dev\\io\\2019\\12\\crawling.txt 파일롣 저장하기
			fw = new FileWriter("c:\\dev\\io\\2019\\12\\crawling.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			pw.println("Date\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tCap");
			for (int i = 0; i < elements.size(); i++) {
				Element trElement = elements.get(i);
				String date = trElement.child(0).text(); // 클래스 안에 것들의 순서 div로
															// 나누어졌을때 .child(0)로
															// 소속 순서 나태냄.
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String cap = trElement.child(6).text();
				String format = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", date, open, high, low, close, volume, cap);
				System.out.print(format);// 모니터 출력
				pw.print(format);// 파일에 저장
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pw != null)
				pw.close();
		}
	}
}
