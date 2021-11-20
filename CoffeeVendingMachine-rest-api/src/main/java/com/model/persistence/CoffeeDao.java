package com.model.persistence;



import java.util.ArrayList;

import com.beans.AddOns;
import com.beans.CoffeeBeans;




public interface CoffeeDao {

	ArrayList<String> getCoffeeDetails() ;
	double addCoffee(String coffee,String size) ;
	double addAddOn(String addOn) ;
	String getCoffeeId(String coffee,String size) ;
	String getAddOnId(String addon) ;
	String getCoffeeName(String coffeeId);
	String getCoffeeSize(String coffeeId);
	ArrayList<String> getAddOns();
	ArrayList<String> getCupSizes();
	public ArrayList<CoffeeBeans> getCoffees();
	ArrayList<AddOns> getAddOnDetails();
}
