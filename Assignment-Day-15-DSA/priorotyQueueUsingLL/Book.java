package priorotyQueueUsingLL;

import java.util.Objects;

public class Book implements Comparable<Book>
{
	private String name;
	private int price;
	private int pages;
	public Book(String name, int price, int pages) {
		super();
		this.name = name;
		this.price = price;
		this.pages = pages;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", pages=" + pages + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, pages, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name) && pages == other.pages && price == other.price;
	}
	
	@Override
	public int compareTo(Book o) {
		if(this.price>o.price)
			return 1;
		else if(this.price<o.price)
			return -1;
		return 0;
	}
	
	

}
