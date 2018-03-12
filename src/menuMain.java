import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class menuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document porterMenu = Jsoup.connect("http://nutrition.sa.ucsc.edu/nutframe.asp?locationNum=25&locationName=Porter").get();
		log(porterMenu.title());
		
	}

}
