package stringDeal;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubString {

	public static void main(String[] args) throws IOException {
		String price = "124554円";
		price = price.substring(0, price.length() - 1);
		// String をint に切り替える
		int p = Integer.parseInt(price);
		System.out.println(p);
		// 時間のフォーマットを設定する
		Date  d = new Date();
		System.out.println(d);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		String skil = "b<>差ｒｊあえいお</b>";
		skil = skil.substring(3, skil.length()-4);
		System.out.println(skil);

	}

}
