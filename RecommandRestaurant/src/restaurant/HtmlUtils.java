package restaurant;

public class HtmlUtils {

    public static String imgHtmlParser(String url){
        StringBuilder htmlParse = new StringBuilder();
        htmlParse.append("<HTML>");
        htmlParse.append("<body>");
        htmlParse.append("<div>");
        htmlParse.append("<img width='350' height='335' src=");
        htmlParse.append(url);
        htmlParse.append(">");
        htmlParse.append("</div>");
        htmlParse.append("</body>");
        htmlParse.append("</HTML>");
        return String.valueOf(htmlParse);
    }

    public static String createImgHtml(String url){
        return imgHtmlParser(url);
    }
}