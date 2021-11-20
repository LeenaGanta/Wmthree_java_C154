package com.model.persistence;



import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.beans.CoffeeBeans;



@Repository
public interface CoffeeDao extends JpaRepository<CoffeeBeans, String> {
	
	@Query("SELECT distinct coffeeName FROM CoffeeBeans")
	ArrayList<String> getCoffeeDetails() ;
	
	@Query("SELECT price FROM CoffeeBeans WHERE coffeeName=:coffee AND cupSize=:size")
	double addCoffee(@Param("coffee")String coffee,@Param("size")String size) ;
	
	@Query("SELECT price FROM AddOns WHERE addOn=:addOn")
	double addAddOn(@Param("addOn") String addOn) ;
	
	@Query("SELECT coffeeId FROM CoffeeBeans WHERE coffeeName=:coffee AND cupSize=:size")
	String getCoffeeId(@Param("coffee")String coffee,@Param("size")String size) ;
	
	@Query("SELECT addOnId FROM AddOns WHERE addOn=:addon")
	String getAddOnId(@Param("addon")String addon) ;
	
	@Query("SELECT coffeeName FROM CoffeeBeans WHERE coffeeId=:coffeeId")
	String getCoffeeName(@Param("coffeeId")String coffeeId);
	
	@Query("SELECT cupSize FROM CoffeeBeans WHERE coffeeId=:coffeeId")
	String getCoffeeSize(@Param("coffeeId")String coffeeId);
	
	@Query("From CoffeeBeans where coffeeId=:coffeeId")
	CoffeeBeans getCoffee(@Param("coffeeId")String coffeeId);
	
	
	@Query("From CoffeeBeans")
	ArrayList<CoffeeBeans> getCoffees();
	
	@Query("SELECT DISTINCT cupSize FROM CoffeeBeans")
	ArrayList<String> getCupSizes();
	
	
}
