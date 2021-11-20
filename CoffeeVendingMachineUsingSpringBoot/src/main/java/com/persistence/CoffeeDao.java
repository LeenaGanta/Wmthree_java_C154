package com.persistence;



import java.util.ArrayList;

import com.beans.AddOns;
import com.beans.CoffeeBeans;




public interface CoffeeDao {

	ArrayList<CoffeeBeans> getCoffeeDetails() ;
	double addCoffee(String coffee,String size) ;
	double addAddOn(String addOn) ;
	String getCoffeeId(String coffee,String size) ;
	String getAddOnId(String addon) ;
	String getCoffeeName(String coffeeId);
	String getCoffeeSize(String coffeeId);
	ArrayList<AddOns> getAddOnDetails();
}
