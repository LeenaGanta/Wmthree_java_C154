package bookDetails;

import java.util.Scanner;

public class BookInput
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		BookList bookList=new BookList();
		System.out.println("====================Before Sort======================================");
		for(Book book:bookList.getBooks())
			System.out.println(book);
		
		System.out.println("=====================Sort Using bookName in Descending Order=========BubbleSort==============");
		
		bookList.bubbleSort();
  
		for(Book book:bookList.getBooks())
			System.out.println(book);
		
		
       System.out.println("===================Sort using Number of Pages============SelectionSort=======================");
		
		bookList.selectionSort();
		for(Book book:bookList.getBooks())
			System.out.println(book);
		
		
	}


}
