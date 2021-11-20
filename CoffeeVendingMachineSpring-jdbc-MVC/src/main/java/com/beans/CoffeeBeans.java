package com.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public class CoffeeBeans
{
	@Getter
	@Setter
	private String coffee_id;
	@Getter
	@Setter
	private String coffeeName;
	@Getter
	@Setter
	private String cup_size;
	@Getter
	@Setter
	private double price;
	@Override
	
	
	
	public String toString() {
		if(coffeeName.length()>7)
		return "" + coffeeName;
		else
			return "" + coffeeName ;
	}
	public CoffeeBeans(String coffeeName, String cup_size, double price) {
		super();
		this.coffeeName = coffeeName;
		this.cup_size = cup_size;
		this.price = price;
	}
	

}
