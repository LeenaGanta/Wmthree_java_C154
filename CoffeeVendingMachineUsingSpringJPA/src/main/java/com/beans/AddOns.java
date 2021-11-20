package com.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddOns {
	
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String addOnId;
	@Getter
	@Setter
	private String addOn;
	@Getter
	@Setter
	private double price;
	@Override
	
	
	
	public String toString() {
		return "" + addOn;
	}
	public AddOns(String addOn) {
		super();
		this.addOn = addOn;
	}
	public AddOns(String addOn, double price) {
		super();
		this.addOn = addOn;
		this.price = price;
	}
	

}
