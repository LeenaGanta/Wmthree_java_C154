package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CoffeeBeans
{
	@Getter
	@Setter
	@Id
	private String coffeeId;
	@Getter
	@Setter
	private String coffeeName;
	@Getter
	@Setter
	private String cupSize;
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
	
	


}
