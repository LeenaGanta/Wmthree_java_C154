package doublyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DoubleMain 
{
	private DoubleLinkedList doubleLL=new DoubleLinkedList();
	public void showMenu() {
		System.out.println("1. Add element to Linked List");
		System.out.println("2. Traverse Linked List");
		System.out.println("3. Deleting data fron  List");
		System.out.println("4. Exit");
	}
	
	public void performMenu(int choice) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		switch (choice) {
		case 1:
			System.out.println("Enter Person ID : ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Person Name : ");
			String name=br.readLine();
			Person person=new Person(id,name);
			doubleLL.insert(person);
			break;

		case 2:
			doubleLL.traversal();
			break;
		case 3:
			System.out.println("Enter Person ID to be deleted : ");
			int id1=Integer.parseInt(br.readLine());
			doubleLL.delete(id1);
			break;
		case 4:
			System.out.println("Thanks for Using out System");
			System.exit(0);
		default:
			break;
		}
	}

}
