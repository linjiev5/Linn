package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo2 {

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

		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = bufr.readLine()) != null) {

			//
			byte[] buf = line.getBytes();

			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.20"), 10000);

			ds.send(dp);
			if ("close".equals(line)) {
				break;
			}
		}
		ds.close();

	}

}
