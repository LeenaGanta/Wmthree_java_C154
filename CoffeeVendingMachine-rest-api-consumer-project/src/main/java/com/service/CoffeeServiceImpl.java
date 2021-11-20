package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.beans.AddOns;
import com.beans.CoffeeBeans;

import com.beans.Strings;

@Service("coffeeService")
public class CoffeeServiceImpl implements CoffeeService {

	@Autowired
	private RestTemplate RestTemplate;

	static double price=0;
	 
	 public void setPrice()
	 {
		 price=0;
	 }
	
	@Override
	public Strings[] getCoffeeTypes() {
      return RestTemplate.getForObject("http://localhost:8080/coffees", Strings[].class);
	}

	

	@Override
	public Strings[] getAddOns()  {
		return RestTemplate.getForObject("http://localhost:8080/addOns",Strings[].class);
		 
	}

	@Override
	public boolean addCoffee(String coffee,String size)  {
		price+=RestTemplate.getForObject("http://localhost:8080/coffeeMenu/coffees/"+coffee+"/"+size,Double.class);
		return true;
	}

	@Override
	public boolean addAddOn(String addOn)  {
		price+=RestTemplate.getForObject("http://localhost:8080/addOnMenu/addOns/"+addOn, Double.class);
		return true;
	}


	@Override
	public String getCoffeId(String coffee,String size){
		return RestTemplate.getForObject("http://localhost:8080/coffeeMenu/"+coffee+"/"+size, String.class);
	}



	@Override
	public String getAddOnId(String addon)  {
		return RestTemplate.getForObject("http://localhost:8080/addOns/"+addon, String.class);
	}


	

	@Override
	public double getCoffeePrice(String coffee)  {
		return RestTemplate.getForObject("http://localhost:8080/coffeeMenu/coffees/"+coffee, Double.class);
	}



	@Override
	public double getAddOnPrice(String addOn)  {
		return RestTemplate.getForObject("http://localhost:8080/addOnMenu/"+addOn, Double.class);
	}



	@Override
	public String getCoffeeName(String coffeeId) {
		return RestTemplate.getForObject("http://localhost:8080/coffeeMenu/"+coffeeId, String.class);
	}



	@Override
	public String getCoffeeSize(String coffeeId)  {
		return RestTemplate.getForObject("http://localhost:8080/coffees/"+coffeeId, String.class);
	}

	@Override
	public Strings[] getCupSizes() {
		return RestTemplate.getForObject("http://localhost:8080/cups",Strings[].class);
	}

	@Override
	public CoffeeBeans[] getCoffees() {
		return RestTemplate.getForObject("http://localhost:8080/coffeeMenu",CoffeeBeans[].class);
	}

	@Override
	public AddOns[] getAddOnDetails() {
		return RestTemplate.getForObject("http://localhost:8080/addOnMenu",AddOns[].class);
	}
	
	



	

}
