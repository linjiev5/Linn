package net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//クライアントからサービス端にデータ送信
		/**
		 * TCP送信，clientの作成確定
		 * 1.TCPクライアント(client客户端)を作成するには，socketオブジェクトを使用する
		 * 	最初から目的サーバを明確したほうがいい
		 * 2.作成が成功すれば，データの送信、受取通路ができたとのこと
		 * 	その通路はsocket流，最下層に建てた。流であることはＩ／Ｏ両方持つことである
		 * 	流のオブジェクトを入力、出力するには，socketを利用する
		 * 3.出力ストリーム（流）を使い，データを送信する
		 * 4.資源を閉じる

		 */
		//
		Socket socket = new Socket("192.168.1.20",10002);

		//


	}

}
