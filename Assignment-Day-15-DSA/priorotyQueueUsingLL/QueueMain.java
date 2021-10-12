package priorotyQueueUsingLL;

public class QueueMain 
{
	public static void main(String[] args) {
		
		Book book1=new Book("AMA", 150, 563);
		Book book2=new Book("MAAL", 100, 563);
		Book book3=new Book("boopm", 126, 563);
		Book book4=new Book("Exehr", 250, 563);
		Book book5=new Book("Dom", 100, 563);
		Book book6=new Book("Mania", 160, 563);
		Book book7=new Book("Ferari", 50, 563);
		Book book8=new Book("Books", 75, 563);
		
		PriorityQueue queue=new PriorityQueue();
		
		queue.add(book1);
		queue.add(book2);
		queue.add(book3);
		queue.add(book4);
		queue.add(book5);
		queue.add(book6);
		queue.add(book7);
		queue.add(book8);
		
		queue.display();
		
		System.out.println("=============================Deleting");
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
	}
	
	

}
