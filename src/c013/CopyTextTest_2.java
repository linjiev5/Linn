package c013;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 *
 */
public class CopyTextTest_2 {
	private static final int BUFFER_SIZE = 1024;

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\\\Users\\\\user\\\\Desktop\\\\現場よく利用しているソフト.txt");
			fw = new FileWriter("E:\\\\現場よく利用しているソフト_1.txt");
			//配列を作って読み取ったデータを保存する
			char[] buf = new char[BUFFER_SIZE];

			//パタメータを作成し，読み取ったデータの数を記録する
			int len = 0;

			while ((len = fr.read(buf)) != 1) {
				fw.write(buf, 0, len);
			}

		} catch (Exception e) {
			//			System.out.println("読み取りませんでした");
//			throw new RuntimeException("読み取りませんでした");
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
		}
	}

}
