/**
 *
 */
package c013;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 行ごとにコピーする
 * @author user
 *
 */
public class CopyTextBufTest {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("buf.tet");
		BufferedReader bufr = new BufferedReader(fr);

		FileWriter fw = new FileWriter("buf_copy.txt");
		BufferedWriter bufw =new BufferedWriter(fw);

		String line = null;
		while((line=bufr.readLine())!=null) {
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		fr.close();
		bufr.close();
		fw.close();
		bufw.close();
	}

}
