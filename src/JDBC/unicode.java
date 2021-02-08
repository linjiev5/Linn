package JDBC;

import java.io.IOException;
import java.net.URLEncoder;

public class unicode {

	public static void main(String[] args) throws IOException {
		String key = URLEncoder.encode("本", "UTF-8");
		System.out.println(key);
		for(int x =0;x<121;x+=30) {
			System.out.println(x+1);
		}
	}

	/**
	 * Unicode文字列に変換する("あ" -> "\u3042")
	 * @param original
	 * @return
	 */
	private static String convertToUnicode(String original) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < original.length(); i++) {
			sb.append(String.format("\\u%04X", Character.codePointAt(original, i)));
		}
		String unicode = sb.toString();
		return unicode;
	}

	/**
	 * Unicode文字列から元の文字列に変換する ("\u3042" -> "あ")
	 * @param unicode
	 * @return
	 */
	private static String convertToOiginal(String unicode) {
		String[] codeStrs = unicode.split("\\\\u");
		int[] codePoints = new int[codeStrs.length - 1]; // 最初が空文字なのでそれを抜かす
		for (int i = 0; i < codePoints.length; i++) {
			codePoints[i] = Integer.parseInt(codeStrs[i + 1], 16);
		}
		String encodedText = new String(codePoints, 0, codePoints.length);
		return encodedText;
	}
}
