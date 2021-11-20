package com.model.service;


import java.util.ArrayList;

import com.beans.AddOns;
import com.beans.CoffeeBeans;




public interface CoffeeService {

	ArrayList<String> getCoffeeTypes() ;
	ArrayList<String> getCupSizes();
	ArrayList<String> getAddOns();
	ArrayList<CoffeeBeans> getCoffees();
	ArrayList<AddOns> getAddOnDetails();
	double addCoffee(String coffee,String size) ;
	double addAddOn(String addOn) ;
	String getCoffeId(String coffee,String size) ;
	String getAddOnId(String addon);
	double getCoffeePrice(String coffee) ;
	double getAddOnPrice(String addOn) ;
	String getCoffeeName(String coffeeId);
	String getCoffeeSize(String coffeeId);
	void setPrice();
	
}
