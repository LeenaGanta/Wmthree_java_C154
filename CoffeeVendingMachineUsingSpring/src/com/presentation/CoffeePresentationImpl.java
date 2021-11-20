package com.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

import com.beans.AddOns;
import com.beans.Bill;
import com.beans.User;
import com.exceptions.MobileNumberLength;
import com.service.BillService;
import com.service.CoffeeService;
import com.service.UserService;
import com.service.VoucherService;

@Component("coffeePresentation")
public class CoffeePresentationImpl implements CoffeePresentation {
	
	@Autowired
	private CoffeeService coffeeService;
	@Autowired
	private UserService userService;
	@Autowired
	private BillService billService;
	@Autowired
	private VoucherService voucherService;

	
	/*

	public CoffeePresentationImpl(CoffeeService coffeeService, UserService userService, BillService billService,
			VoucherService voucherService) {
		super();
		this.coffeeService = coffeeService;
		this.userService = userService;
		this.billService = billService;
		this.voucherService = voucherService;
	}*/


	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String mobileNumber="";
	ArrayList<String> coffeeBill=null; 
	ArrayList<String> addonsBill=null;
	
	@Override
	public void showMenu() {

		System.out.println("1. Already a User, Login ");
		System.out.println("2. New User, Register!");

	}
	
	// Showing Coffee Menu 
	public void showCoffeeMenu() throws ClassNotFoundException, SQLException
	{
		System.out.println("Select type of Coffee ...");
		ArrayList<String> coffeeMenu=coffeeService.getCoffeeTypes();
		int index=1;
		for(int i=0;i<coffeeMenu.size();i++)
		{
			System.out.println(index+". "+coffeeMenu.get(i));
			index++;
		}
		
//		for(String coffee:coffeeMenu)
//			System.out.println(coffee);
	}
	
	// Showing CupSize Menu
	public void showCupSizeMenu()
	{
		System.out.println("Select type of Cup Size ...");
		System.out.println("1. Regular    2. Large    3. Extra Large");
	}
	
	// Showing AddOns Menu
	public void showAddOnsMenu() throws ClassNotFoundException, SQLException
	{
		System.out.println("Select type of AddOns ...");
		ArrayList<AddOns> addOns=coffeeService.getAddOns();
		int index=1;
		for(int i=0;i<addOns.size();i++)
		{
			System.out.println(index+". "+addOns.get(i));
			index++;
		}
	}
	
	// Performing AddOn Menu
	public void performAddOnMenu(int choice) throws ClassNotFoundException, SQLException
	{
		switch(choice)
		{
		case 1:
			coffeeService.addAddOn("Whipped Cream");
			addonsBill.add("Whipped Cream");
			break;
		case 2:
			coffeeService.addAddOn("Chocolate");
			addonsBill.add("Chocolate");
			break;
		case 3:
			coffeeService.addAddOn("Hazelnut");
			addonsBill.add("Hazelnut");
			break;
		case 4:
			coffeeService.addAddOn("Cocoa Powder");
			addonsBill.add("Cocoa Powder");
			break;
		case 5:
			coffeeService.addAddOn("Honey");
			addonsBill.add("Honey");
			break;
		case 6:
			coffeeService.addAddOn("Vanilla Extract");
			addonsBill.add("Vanilla Extract");
			break;
		case 7:
			coffeeService.addAddOn("Condensed milk");
			addonsBill.add("Condensed milk");
			break;
		case 8:
			coffeeService.addAddOn("Maple Syrup");
			addonsBill.add("Maple Syrup");
			break;
			
		default:
			System.out.println("Invalid Choice");
			
			
		}
	}
	// Perform CupSize Menu
	public void performCupSizeMenu(String coffee,int choice) throws ClassNotFoundException, SQLException
	{
		switch(choice)
		{
		case 1:
			coffeeService.addCoffee(coffee,"Regular");
			coffeeBill.add(coffeeService.getCoffeId(coffee,"Regular"));
			break;
		case 2:
			coffeeService.addCoffee(coffee, "Large");
			coffeeBill.add(coffeeService.getCoffeId(coffee,"Large"));
			break;
		case 3:
			coffeeService.addCoffee(coffee, "Extra Large");
			coffeeBill.add(coffeeService.getCoffeId(coffee,"Extra Large"));
			break;
		default:
			System.out.println("Invalid Choice!");
			System.exit(0);
		}
	}
	
	// Show Bill
	public void showBill(String mobileNumber,String voucherCode) throws ClassNotFoundException, SQLException
	{
		for(int i=0;i<coffeeBill.size();i++)
	    	System.out.println(coffeeService.getCoffeeName(coffeeBill.get(i))+", "+coffeeService.getCoffeeSize(coffeeBill.get(i))+  " : "+coffeeService.getCoffeePrice(coffeeBill.get(i)));
		for(int i=0;i<addonsBill.size();i++)
			System.out.println(addonsBill.get(i)+ " : "+coffeeService.getAddOnPrice(addonsBill.get(i)));
     	ArrayList<Bill> bill=billService.getBill(mobileNumber,voucherCode);
     	for(Bill bill1:bill)
	    System.out.println(bill1);
	}
	
	
	// Perform Coffee Menu
	public void performCoffeeMenu(int choice,String mobileNumber) throws ClassNotFoundException, SQLException, NumberFormatException, IOException
	{
		switch(choice)
		{
		case 1:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice1=Integer.parseInt(br.readLine());
			performCupSizeMenu("Mocha",choice1);
			break;
		case 2:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice2=Integer.parseInt(br.readLine());
			performCupSizeMenu("Latte",choice2);
			break;
		case 3:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice3=Integer.parseInt(br.readLine());
			performCupSizeMenu("Cappuccino",choice3);
			break;
		case 4:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice4=Integer.parseInt(br.readLine());
			performCupSizeMenu("Decaf",choice4);
			break;
		case 5:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice5=Integer.parseInt(br.readLine());
			performCupSizeMenu("Espresso",choice5);
			break;
		case 6:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice6=Integer.parseInt(br.readLine());
			performCupSizeMenu("Machiato",choice6);
		    break;
		case 7:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice7=Integer.parseInt(br.readLine());
			performCupSizeMenu("Cold Coffee",choice7);
			break;
		case 8:
			showCupSizeMenu();
			System.out.println("Enter choice ...");
			int choice8=Integer.parseInt(br.readLine());
			performCupSizeMenu("Arabica",choice8);
			break;
	
		default:
			System.out.println("Invalid choice!");
			System.exit(0);
		
			
		}
	}
     
	
	@Override
	public void perfrormMenu(int choice)  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		coffeeBill=new ArrayList<String>();
		addonsBill=new ArrayList<String>();
		 coffeeService.setPrice();
		try
		{
			switch(choice)
			{
			case 1:
				System.out.println("Enter Mobile Number : ");
				String mobileNumber=br.readLine();
				if(mobileNumber.length()!=10)
					throw new MobileNumberLength("Please enter valid number");
				else {
				if(!userService.userValidate(mobileNumber))
				{	System.out.println("Please register yourself for a Coffee!");
				    break;
				}
				else 
				{	
					 while(true)  // Coffee
					{
						
						showCoffeeMenu();
						String coffeeStatus="";
						System.out.println("Enter Choice Number: ");
						int choiceCoffee=Integer.parseInt(br.readLine());
						performCoffeeMenu(choiceCoffee,mobileNumber);
						
						
					 while(true) // AddOn
						{
						System.out.println("Do you want any Add-Ons (yes/no) : ");
						String wantAddOns=br.readLine();
						 int choiceAddOn=0;
						if(wantAddOns.equals("yes"))
						{	 
							  showAddOnsMenu();
						      System.out.println("Enter choice of Add On: ");
						      choiceAddOn=Integer.parseInt(br.readLine());
						      performAddOnMenu(choiceAddOn);
						    
						}
						else
						{ 
							System.out.println("Do you want another coffee (yes/no) :");
						    coffeeStatus=br.readLine();
						    if(coffeeStatus.equals("yes"))
							  break;
						   else
						   { 
							  
							   while(true)
							   {
								 System.out.println("Do you have a voucher (yes/no) : ");
								 String voucherStatus=br.readLine();
							    if(voucherStatus.equals("yes"))
							    {
							    	System.out.println("Enter Voucher Code: ");
							    	String voucherCode=br.readLine();
							    	if(voucherService.isVoucher(voucherCode))
							    	{ System.out.println("Voucher applied");
							    	System.out.println("Your Bill...");
							    	showBill(mobileNumber,voucherCode);
							    	System.out.println("Thanks for Visiting, Have a Good Day");
							    	System.out.println("=======================================");
							    	break;}
							    	else {
							    		System.out.println("Enter Valid Voucher Code");
							    	}
							    }
			
							    else
							    {
							    	System.out.println("Your Bill...");
							    	showBill(mobileNumber,"");
							    	System.out.println("Thanks for Visiting, Have a Good Day");
							    	System.out.println("=======================================");
							    	break;
							    }
						    }
							  
						 }
					   }
						if(wantAddOns.equals("no"))
							break;
						}
					if(coffeeStatus.equals("no"))
					{	billService.setBillDetails(coffeeBill);break;}
					 
				}
				 break;
					 
				}
				}
				 
				
				
				
			case 2:
				System.out.println("Enter Name : ");
				String name=br.readLine();
				System.out.println("Enter Mobile Number : ");
				String mobileNumber1=br.readLine();
				if(mobileNumber1.length()!=10)
					throw new MobileNumberLength("Please enter valid mobile number");
				else {
				User user=new User(name, mobileNumber1);
				if(userService.addUser(user))
					System.out.println("Registered Successfully! Login to get a Coffee");
				}
				break;
					
			}
				
		}
		catch(IOException| NumberFormatException | ClassNotFoundException|  SQLException exc) {
			System.out.println(exc.getMessage());
		}
		catch(MobileNumberLength exc)
		{
			System.out.println(exc.getMessage());
		}
		catch(DuplicateKeyException exc)
		{
			System.out.println("Mobile Number already exists");
		}
	
	}
}
		

	




