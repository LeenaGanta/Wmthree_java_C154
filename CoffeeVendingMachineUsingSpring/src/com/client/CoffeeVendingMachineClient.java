package com.client;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.presentation.CoffeePresentation;

//import config.JavaConfigAnnotation;
//import config.JavaConfiguration;

public class CoffeeVendingMachineClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("coffeeAnotation.xml");
		CoffeePresentation coffeePresentation=(CoffeePresentation)springContainer.getBean("coffeePresentation");
		
	//	ApplicationContext springContainer=new AnnotationConfigApplicationContext(JavaConfigAnnotation.class);
	//	CoffeePresentation coffeePresentation=(CoffeePresentation)springContainer.getBean("coffeePresentation");
		
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
