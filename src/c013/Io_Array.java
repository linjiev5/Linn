package c013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * ローカルのcsvを読み取りする
 * @author user
 *
 */
public class Io_Array {
	public static void main(String[]args) {

	}
	private void bookList() {
		try {
			FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\Book\\Book.csv");
			BufferedReader bufferedReader = new BufferedReader(reader);

			Book book = new Book();
			String line;
			bufferedReader.readLine();
			while ((line = bufferedReader.readLine()) != null) {
				String[] st = line.split(",");
				System.out.println(st.length);
				book.setBookId(st[0].trim());
				book.setTitle(st[1].trim());
				book.setAuthor(st[2].trim());
				book.setIsbn(st[3].trim());
				book.setPrice(Integer.valueOf(st[4]));
			}
			reader.close();
			System.out.println(book);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
