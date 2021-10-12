package priorotyQueueUsingLL;

public class PriorityQueue {
	Node head;
	static int front=-1;
	class Node{
		Book data;
		Node next;
		Node(Book data){
			this.data=data;
			next=null;
		}
	}
	
	
	public void add(Book book)
	{
		Node temp=new Node(book);
			if(head==null)
			{
				head=temp;
				front++;
				return;
			}
			else 
			{
			if(head.data.compareTo(temp.data)>0) {
				temp.next=head;
				head=temp;
				front++;
				return;
			}
			Node curr=head;
			while(curr.next!=null && curr.next.data.compareTo(temp.data)<0)
			 curr=curr.next;
			temp.next=curr.next;
			curr.next=temp;
	        front++;
			}
			
	}
	public void display()
	{
		Node curr=head;
		int temp=front;
		while(temp!=-1)
		{
			System.out.println(curr.data);
			curr=curr.next;
			temp--;
		}
	}
	public Book remove()
	{
		if(front!=-1)
		{
			if(head!=null)
			{
				Node temp=head;
				head=temp.next;
				front--;
				return temp.data;
			}
		}
		else
			System.out.println("Queue is empty");
		return null;
	}

}
