package stackUsingLinkedList;


public class Stack
{
	Node head;
	static int top=-1;
	//static int size=10;
	class Node
	{
		Employee data;
		Node next;
		Node(Employee emp)
		{
			data=emp;
			next=null;
		}
	}
	
	public void push(Employee data)
	{
		Node temp=new Node(data);
		
		if(head==null)
		{	head=temp; top++;}
		else {
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
				if(curr.data.equals(data))
				{	return;}
				
			}
			temp.next=head;
			head=temp;
			top++;
		}
	}

	
		
	
	public void display()
	{
		Node curr=head;
		int temp=top;
		while(temp!=-1)
		{
			System.out.println(curr.data+" ");
			curr=curr.next;
			temp--;
		}
	}
	public Employee pop()
	{
		if(top!=-1)
		{
			if(head!=null)
			{
				Node temp=head;
				head=temp.next;
				top--;
				return temp.data;
			}	
		}
		System.out.println("Stack is empty");
		return null;
		
	}

}
