package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("受取開始");
		/**
		 *  ＵＤＰを受取の基本
		 *  1.udpサービスを作成,データを受け取るために端子番号を明確するべき
		 *  2.パケージを作成、受取のために
		 *  3.socketのreceiveメソッドで受け取ったデータをパケージに保存する
		 *  4.パケージのメソッドでデータを解析する
		 *  5.資源を閉じる
		 *
		 */
		// 1.
		DatagramSocket ds = new DatagramSocket(10000);

		while (true) {

			// 2.
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			// 3.
			ds.receive(dp);

			// 4.
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String text = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + ":" + port + ":" + text);
			// 5.

		}
	}

}
