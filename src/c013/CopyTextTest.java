package c013;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * デスクトップのtxtをｕｓｂにコピーする
 * @author linjie
 *
 */
public class CopyTextTest {
/**
 *
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {

		//1,读取一个已有的文本文件，使用字符读取流和文件相关联

			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\現場よく利用しているソフト.txt");

		//2,创建一个目的，用于存储读到的数据

			FileWriter fw = new FileWriter("E:\\現場よく利用しているソフト.txt");

		//3,频繁的读写操作
			int ch = 0;
			while((ch=fr.read())!=-1) {
				fw.write(ch);
			}
		//4,关闭流资源
			fr.close();
			fw.close();


	}

}
