package com.model.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.AddOns;
import com.beans.CoffeeBeans;
import com.model.persistence.AddOnDao;
import com.model.persistence.CoffeeDao;

@Service("coffeeService")
public class CoffeeServiceImpl implements CoffeeService {

	@Autowired
	private CoffeeDao coffeeDao;
	@Autowired
	private AddOnDao addOnDao;
	
	

	
	public void setCoffeeDao(CoffeeDao coffeeDao) {
		this.coffeeDao = coffeeDao;
	}

	public void setAddOnDao(AddOnDao addOnDao) {
		this.addOnDao = addOnDao;
	}



	static double price=0;
	 
	 public void setPrice()
	 {
		 price=0;
	 }
	
	@Override
	public ArrayList<String> getCoffeeTypes()  {
		return coffeeDao.getCoffeeDetails();
	}


	@Override
	public ArrayList<String> getAddOns()  {
		return  addOnDao.getAddOns();
	}

	@Override
	public boolean addCoffee(String coffee,String size)  {
		price+=coffeeDao.addCoffee(coffee,size);
		return true;
	}

	@Override
	public boolean addAddOn(String addOn)  {
		price+=coffeeDao.addAddOn(addOn);
		return true;
	}


	@Override
	public String getCoffeId(String coffee,String size)  {
		return coffeeDao.getCoffeeId(coffee,size);
	}



	@Override
	public String getAddOnId(String addon)  {
		return coffeeDao.getAddOnId(addon);	
	}

	

	@Override
	public double getCoffeePrice(String coffee){
		return coffeeDao.addCoffee(coffeeDao.getCoffeeName(coffee), coffeeDao.getCoffeeSize(coffee));
	}



	@Override
	public double getAddOnPrice(String addOn) {
		return coffeeDao.addAddOn(addOn);
	}



	@Override
	public String getCoffeeName(String coffeeId) {
		return coffeeDao.getCoffeeName(coffeeId);
	}



	@Override
	public String getCoffeeSize(String coffeeId) {
		return coffeeDao.getCoffeeSize(coffeeId);
	}

	@Override
	public ArrayList<CoffeeBeans> getCoffees() {
		return coffeeDao.getCoffees();
	}

	@Override
	public ArrayList<AddOns> getAddOnDetails() {
		return addOnDao.getAddOnDetails();
	}

	@Override
	public ArrayList<String> getCupSizes() {
		return coffeeDao.getCupSizes();
	}
	
	



	

}
