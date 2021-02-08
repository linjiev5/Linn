package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("発送開始");
		/**
				 *  1.udpのsocketサービスを作成する
				 *  2.送るデータをpackageする
				 *  3.udpのsocketでデータを送る
				 *  4.socketサービスを閉じる
				 *
				 */
				// 1.udpサービス。DatagramSocketオブジェクトを使う
		DatagramSocket ds = new DatagramSocket();
			// 2.送ろうとするデータをpackegeする
			String str = "送りました";
			//
			byte[] buf = str.getBytes();

			DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.20"),10000);

			ds.send(dp);
			ds.close();

	}

}
