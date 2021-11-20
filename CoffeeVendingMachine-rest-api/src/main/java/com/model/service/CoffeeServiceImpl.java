package com.model.service;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.AddOns;
import com.beans.CoffeeBeans;
import com.model.persistence.CoffeeDao;

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
	public ArrayList<String> getCoffeeTypes() {
		return coffeeDao.getCoffeeDetails();
	}

	

	@Override
	public ArrayList<String> getAddOns()  {
		return (ArrayList<String>) coffeeDao.getAddOns();
	}

	@Override
	public double addCoffee(String coffee,String size)  {
		price+=coffeeDao.addCoffee(coffee,size);
		return price;
	}

	@Override
	public double addAddOn(String addOn)  {
		price+=coffeeDao.addAddOn(addOn);
		return price;
	}


	@Override
	public String getCoffeId(String coffee,String size){
		return coffeeDao.getCoffeeId(coffee,size);
	}



	@Override
	public String getAddOnId(String addon)  {
		return coffeeDao.getAddOnId(addon);	
	}


	

	@Override
	public double getCoffeePrice(String coffee)  {
		return coffeeDao.addCoffee(coffeeDao.getCoffeeName(coffee), coffeeDao.getCoffeeSize(coffee));
	}



	@Override
	public double getAddOnPrice(String addOn)  {
		return coffeeDao.addAddOn(addOn);
	}



	@Override
	public String getCoffeeName(String coffeeId) {
		return coffeeDao.getCoffeeName(coffeeId);
	}



	@Override
	public String getCoffeeSize(String coffeeId)  {
		return coffeeDao.getCoffeeSize(coffeeId);
	}

	@Override
	public ArrayList<String> getCupSizes() {
		return coffeeDao.getCupSizes();
	}

	@Override
	public ArrayList<CoffeeBeans> getCoffees() {
		return coffeeDao.getCoffees();
	}

	@Override
	public ArrayList<AddOns> getAddOnDetails() {
		return coffeeDao.getAddOnDetails();
	}
	
	



	

}
