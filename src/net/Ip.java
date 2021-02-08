package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip {

	public static void main(String[] args) throws UnknownHostException {

		// ローカルのＩＰアドレスのオブジェクトを取得する
		InetAddress ip = InetAddress.getLocalHost();


		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());

		// ほかのパソコンのＩＰアドレスのオブジェクトを取得する
		ip = InetAddress.getByName("www.baidu.com");
		System.out.println(ip.getHostName());
	}

}
