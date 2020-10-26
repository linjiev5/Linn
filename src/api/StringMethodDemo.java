package api;

public class StringMethodDemo {

	public static void main(String[] args) {
		/*
		 * 按照面向对象的思想对字符串进行功能分类。
		 * "abcd"
		 * 1,获取:
		 * 1.1获取字符串中字符的个数（长度）
		 * 	int length();
		 * 1.2根据位置获取字符。
		 * 	char charAt(int index);
		 * 1.3根据字符获取在字符串中的第一次出现的位置。
		 * 	int indexOf(int ch);
		 * 	int indexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置
		 * 	int indexOf(String str);
		 * 	int indexOf(String str,int fromIndex);
		 *
		 * 	int lastIndexOf(int ch);
		 * 	int lastIndexOf(int ch,int fromIndex):从指定位置进行ch的查找最后一次出现位置
		 * 	int lastIndexOf(String str);
		 * 	int lastIndexOf(String str,int fromIndex);
		 */
		stringConstruvtorDemo_1();
		stringConstruvtorDemo();
	}
	public static void stringConstruvtorDemo() {
		String a = new String();//

		byte[] arr = {97,66,67,68};
		String a1 = new String(arr);
		System.out.println("a1="+a1);
	}
	private static void stringConstruvtorDemo_1() {
		String a = "abcdae";

		System.out.println("length:"+a.length());
		System.out.println("char:"+a.charAt(2));
		System.out.println("index:"+a.indexOf('a'));
		System.out.println("lastIndex:"+a.lastIndexOf('a'));


		System.out.println("substring:"+a.substring(1, 3));


	}

}
