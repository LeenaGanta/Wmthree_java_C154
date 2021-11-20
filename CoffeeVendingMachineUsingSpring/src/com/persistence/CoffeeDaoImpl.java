package com.persistence;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.beans.AddOns;

import com.helper.AddOnMapper;
import com.helper.CoffeeMapper;





@Repository("coffeeDao")
public class CoffeeDaoImpl implements CoffeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
  
	
	@Override
	public double addCoffee(String coffee,String size)  {
       
		String query="SELECT COFFEEPRICE FROM COFFEE WHERE COFFEENAME=? AND CUP_SIZE=?";
		
		double price1=jdbcTemplate.queryForObject(query, Double.class, coffee,size);
		return price1;
	}

	@Override
	public ArrayList<String> getCoffeeDetails()  {
       
		List<String> coffee=new ArrayList<String>();
		String query="SELECT DISTINCT COFFEENAME FROM COFFEE";
		
		coffee=jdbcTemplate.query(query, new CoffeeMapper());
		return (ArrayList<String>) coffee;
	}

	




	@Override
	public ArrayList<AddOns> getAddOnDetails() {
		
		List<AddOns> addOns=new ArrayList<AddOns>();
		String query="SELECT ADDONNAME FROM ADDON";
		addOns= jdbcTemplate.query(query,new AddOnMapper());
			return (ArrayList<AddOns>)addOns;
	}

	@Override
	public double addAddOn(String addOn)  {

		String query="SELECT PRICE FROM ADDON WHERE ADDONNAME=?";
		double price1=jdbcTemplate.queryForObject(query,Double.class, addOn);
		return price1;
	}

	
	@Override
	public String getCoffeeId(String coffee,String size) {
		
		
		String query="SELECT COFFEE_ID FROM COFFEE WHERE COFFEENAME=? AND CUP_SIZE=? ";
		String coffeeID=jdbcTemplate.queryForObject(query, String.class,coffee,size);
		return coffeeID;
	}


	@Override
	public String getAddOnId(String addon) {
	
		
		String query="SELECT ADDON_ID FROM ADDON WHERE ADDONNAME=?";
		String addonId=jdbcTemplate.queryForObject(query,String.class,addon);
		return addonId;
	}


	@Override
	public String getCoffeeName(String coffeeId) {
		
		String query="SELECT COFFEENAME FROM COFFEE WHERE COFFEE_ID=?";
		String coffeeName=jdbcTemplate.queryForObject(query,String.class,coffeeId);
		return coffeeName;
	}


	@Override
	public String getCoffeeSize(String coffeeId)  {
		
		String query="SELECT CUP_SIZE FROM COFFEE WHERE COFFEE_ID=?";
		String cupSize=jdbcTemplate.queryForObject(query, String.class,coffeeId);
		return cupSize;
	}


	
	
	
	
}


