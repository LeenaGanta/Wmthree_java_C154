package com.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class AddOns {
	
	
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
	

}
