package c013;

/**
 * 本のクラスを定義する
 *
 * @author linjie
 */
public class Book {


	    private String bookId;
	    private String title;
	    private String author;
	    private String isbn;
	    private int price;

	    public void setBookId(String bookId) {
	        this.bookId = bookId;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setIsbn(String isbn) {
	        this.isbn = isbn;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public String getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public int getPrice() {
	        return price;
	    }
}
