package com.service;


import java.util.ArrayList;

import com.beans.AddOns;
import com.beans.CoffeeBeans;

import com.beans.Strings;





public interface CoffeeService {

	Strings[] getCoffeeTypes() ;
	Strings[] getCupSizes();
	Strings[] getAddOns();
	CoffeeBeans[] getCoffees();
	AddOns[] getAddOnDetails();
	boolean addCoffee(String coffee,String size) ;
	boolean addAddOn(String addOn) ;
	String getCoffeId(String coffee,String size) ;
	String getAddOnId(String addon);
	double getCoffeePrice(String coffee) ;
	double getAddOnPrice(String addOn) ;
	String getCoffeeName(String coffeeId);
	String getCoffeeSize(String coffeeId);
	void setPrice();
	
}
