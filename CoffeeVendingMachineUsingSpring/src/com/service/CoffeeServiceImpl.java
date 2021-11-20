package com.service;


import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.AddOns;
import com.persistence.CoffeeDao;

@Service("coffeeService")
public class CoffeeServiceImpl implements CoffeeService {

	@Autowired
	private CoffeeDao coffeeDao;
	
	 public CoffeeServiceImpl(CoffeeDao coffeeDao) {
		super();
		this.coffeeDao = coffeeDao;
	}



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
	public ArrayList<AddOns> getAddOns() throws ClassNotFoundException, SQLException {
		return (ArrayList<AddOns>) coffeeDao.getAddOnDetails();
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
