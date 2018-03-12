import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class menuMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String porterURL = "http://nutrition.sa.ucsc.edu/nutframe.asp?locationNum=25&locationName=Porter";
		Document porterMenu = Jsoup.connect(porterURL).get();
		System.out.println(porterMenu.title());
		
		Element breakfastTable = porterMenu.select("table").get(1);
		Elements breakfastList = breakfastTable.select("tr");
		
		
//		for (int i = 1; i < breakfastList.size(); i++) {
//			Element row = breakfastList.get(i);
//			Elements cols = row.select("td");
//		}
		
		//Elements paragraphs = porterMenu.getElementsByTag("th");
		//for (Element paragraph : paragraphs) {
		//	System.out.println(paragraph.text());
		//}
		
	}

}
