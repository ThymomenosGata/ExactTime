import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        extactTime();
    }

    public static void extactTime() throws IOException {
        Document doc = Jsoup.connect("https://time.is").get();
        String str = doc.body().getElementById("twd").getAllElements().text();
        System.out.print(str);

    }
}
