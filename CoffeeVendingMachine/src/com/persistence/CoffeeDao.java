package com.persistence;


import java.sql.SQLException;
import java.util.ArrayList;




public interface CoffeeDao {

	ArrayList<String> getCoffeeDetails() throws ClassNotFoundException, SQLException;
	ArrayList<String> getAddOnDetails() throws ClassNotFoundException, SQLException;
	double addCoffee(String coffee,String size) throws ClassNotFoundException, SQLException;
	double addAddOn(String addOn) throws SQLException, ClassNotFoundException;
	String getCoffeeId(String coffee,String size) throws ClassNotFoundException, SQLException;
	String getAddOnId(String addon) throws ClassNotFoundException, SQLException;
	String getCoffeeName(String coffeeId) throws ClassNotFoundException, SQLException;
	String getCoffeeSize(String coffeeId)throws ClassNotFoundException, SQLException;
}
