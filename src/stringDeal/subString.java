package stringDeal;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class subString {

	public static void main(String[] args) throws IOException {
		String price = "124554円";
		price = price.substring(0, price.length() - 1);
		int p = Integer.parseInt(price);
		System.out.println(p);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		String skil = "b<>差ｒｊあえいお</b>";
		skil = skil.substring(3, skil.length()-4);
		System.out.println(skil);
	}

}
