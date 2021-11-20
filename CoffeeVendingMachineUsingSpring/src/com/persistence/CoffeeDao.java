package com.persistence;



import java.util.ArrayList;

import com.beans.AddOns;




public interface CoffeeDao {

	ArrayList<String> getCoffeeDetails() ;
	double addCoffee(String coffee,String size) ;
	double addAddOn(String addOn) ;
	String getCoffeeId(String coffee,String size) ;
	String getAddOnId(String addon) ;
	String getCoffeeName(String coffeeId);
	String getCoffeeSize(String coffeeId);
	ArrayList<AddOns> getAddOnDetails();
}
