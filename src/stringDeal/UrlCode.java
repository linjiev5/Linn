package stringDeal;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlCode {

	public static void main(String[] args) throws Exception {

		String book = "本";
		System.out.println("正常の文字："+book);
		book = URLEncoder.encode(book, "UTF-8");
		System.out.println("エンコード処理した文字："+book);
		book = URLDecoder.decode(book,"utf-8");
		System.out.println("でエンコード処理した文字："+book);

	}

}
