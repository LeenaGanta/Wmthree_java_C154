package doublyLinkedList;

public class DoubleLinkedList 
{
	Node head;
	class Node
	{
		Person data;
		Node next,prev;
		Node(Person data)
		{
			this.data=data;
			next=prev=null;
		}
	}
	
	public void insert(Person data)
	{
		Node temp=new Node(data);
		if(head==null)
			head=temp;
		else
		{
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.prev=curr;
			
		}
	}
	public void traversal()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
	}
	public void delete(int data)
	{
		if (head != null) {
			if (head.data.getId() == data) {
				head = head.next;
				head.prev=null;
				System.out.println("Person deleted");
			} 
			else {
				Node curr = head;
				while ( curr.next != null && curr.next.data.getId() != data ) {
					curr = curr.next;
				}
				   curr.next = curr.next.next;		
					System.out.println("Person deleted");
				

			}
	}
	}
}
