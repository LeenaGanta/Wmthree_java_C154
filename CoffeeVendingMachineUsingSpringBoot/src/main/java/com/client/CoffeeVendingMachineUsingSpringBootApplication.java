package com.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.presentation.CoffeePresentation;

@SpringBootApplication(scanBasePackages = "com")
public class CoffeeVendingMachineUsingSpringBootApplication implements CommandLineRunner{

	@Autowired
	private CoffeePresentation coffeePresentation;
	public static void main(String[] args) {
		SpringApplication.run(CoffeeVendingMachineUsingSpringBootApplication.class, args);
	}

	@SuppressWarnings("resource")
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
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
