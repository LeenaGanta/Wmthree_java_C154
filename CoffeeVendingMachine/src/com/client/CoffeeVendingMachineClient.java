package com.client;

import java.io.IOException;
import java.util.Scanner;



import com.presentation.CoffeePresentation;
import com.presentation.CoffeePresentationImpl;



public class CoffeeVendingMachineClient {

	 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
	
	   CoffeePresentation coffeePresentation=new CoffeePresentationImpl();
		while(true) {
			System.out.println("Welcome!");
			System.out.println("Want to have a coffee, Please login");
			coffeePresentation.showMenu();
			System.out.println("Enter choice");
			int choice=scanner.nextInt();
            coffeePresentation.perfrormMenu(choice);
		}

	}
}
