package doublyLinkedList;

import java.io.IOException;
import java.util.Scanner;

public class DoublyLLMain 
{
public static void main(String[] args) throws NumberFormatException, IOException {
		
		DoubleMain doubleMain=new DoubleMain();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
		doubleMain.showMenu();
		System.out.println("Enter choice : ");
		int choice=scanner.nextInt();
		doubleMain.performMenu(choice);
		}

	}

}
