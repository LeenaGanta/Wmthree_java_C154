package com.service;

import java.sql.SQLException;
import java.util.ArrayList;







public interface CoffeeService {

	ArrayList<String> getCoffeeTypes() throws ClassNotFoundException, SQLException;
	ArrayList<String> getAddOns() throws ClassNotFoundException, SQLException;
	boolean addCoffee(String coffee,String size) throws ClassNotFoundException, SQLException;
	boolean addAddOn(String addOn) throws ClassNotFoundException, SQLException;
	String getCoffeId(String coffee,String size) throws ClassNotFoundException, SQLException;
	String getAddOnId(String addon) throws ClassNotFoundException, SQLException;
	double getCoffeePrice(String coffee) throws ClassNotFoundException, SQLException;
	double getAddOnPrice(String addOn) throws ClassNotFoundException, SQLException;
	String getCoffeeName(String coffeeId) throws ClassNotFoundException, SQLException;
	String getCoffeeSize(String coffeeId)throws ClassNotFoundException, SQLException;
	void setPrice();
	
}
