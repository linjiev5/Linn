/**
 *
 */
package api;

/**
 * @author user
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * String类的特点；
		 * 字符串对象一旦被初始化就不会被改变。
		 */
		stringDemo2();
	}

	public static void stringDemo2() {

		String a = "abc";//创建一个字符串对象在常量池中。
		String a1 =new String("abc");//创建两个对象一个new一个字符串在堆内存中。

		System.out.println(a1==a);//false
		System.out.println(a.equals(a1));//true
		//string类中的equals复写object中的equals建立了string类自己的判断字符串对象是否相同的依据。
		//其实就是比较字符串的内容。

	}
	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池的特点
	 * 池中没有就建立，池中有，直接用。
	 */
 private static void stringDemo1() {

	 String s = "abc";//"abc"存储在字符串常量池中。
	 //s="nba";
	 String s1 = "abc";
 }
}
