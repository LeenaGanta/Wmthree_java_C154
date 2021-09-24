package bookDetails;

public class Book
{
	private int bookID,noOfPages,price;
	private String bookName,authorName;
	public Book(int bookID, String bookName, String authorName, int noOfPages, int price) {
		super();
		this.bookID = bookID;
		this.noOfPages = noOfPages;
		this.price = price;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public int getBookID() {
		return bookID;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", noOfPages=" + noOfPages + ", price=" + price + ", bookName=" + bookName
				+ ", authorName=" + authorName + "]";
	}
	
	

}
