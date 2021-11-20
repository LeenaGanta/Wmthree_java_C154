package com.service;


import java.sql.SQLException;
import java.util.ArrayList;




import com.persistence.CoffeeDao;
import com.persistence.CoffeeDaoImpl;

public class CoffeeServiceImpl implements CoffeeService {


	private CoffeeDao coffeeDao=new CoffeeDaoImpl();
	
	static double price=0;
	 
	 public void setPrice()
	 {
		 price=0;
	 }
	
	@Override
	public ArrayList<String> getCoffeeTypes() throws ClassNotFoundException, SQLException {
		return coffeeDao.getCoffeeDetails();
	}

	

	@Override
	public ArrayList<String> getAddOns() throws ClassNotFoundException, SQLException {
		return coffeeDao.getAddOnDetails();
	}

	@Override
	public boolean addCoffee(String coffee,String size) throws ClassNotFoundException, SQLException {
		price+=coffeeDao.addCoffee(coffee,size);
		return true;
	}

	@Override
	public boolean addAddOn(String addOn) throws ClassNotFoundException, SQLException {
		price+=coffeeDao.addAddOn(addOn);
		return true;
	}


	@Override
	public String getCoffeId(String coffee,String size) throws ClassNotFoundException, SQLException {
		return coffeeDao.getCoffeeId(coffee,size);
	}



	@Override
	public String getAddOnId(String addon) throws ClassNotFoundException, SQLException {
		return coffeeDao.getAddOnId(addon);	
	}


	

	@Override
	public double getCoffeePrice(String coffee) throws ClassNotFoundException, SQLException {
		return coffeeDao.addCoffee(coffeeDao.getCoffeeName(coffee), coffeeDao.getCoffeeSize(coffee));
	}



	@Override
	public double getAddOnPrice(String addOn) throws ClassNotFoundException, SQLException {
		return coffeeDao.addAddOn(addOn);
	}



	@Override
	public String getCoffeeName(String coffeeId) throws ClassNotFoundException, SQLException {
		return coffeeDao.getCoffeeName(coffeeId);
	}



	@Override
	public String getCoffeeSize(String coffeeId) throws ClassNotFoundException, SQLException {
		return coffeeDao.getCoffeeSize(coffeeId);
	}
	
	



	

}
