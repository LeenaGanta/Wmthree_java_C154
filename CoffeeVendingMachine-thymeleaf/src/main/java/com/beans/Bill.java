package com.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Bill {
 
	
	@Getter
	@Setter
	private double totalValue;
	@Getter
	@Setter
	private int discount;
	@Getter
	@Setter
	private double netValue;
	@Getter
	@Setter
	private int gst;
	@Getter
	@Setter
	private int serviceTax;
	
	
	private double totalBill;

	public double getDiscountedVal()
	{
		double temp=(getDiscount() * getTotalValue())/100;
		return temp;
	}
	
	public double getNettedVal()
	{
		double temp=getGSTValue()+getTotalValue();
		return temp;
	}
	
	public double getGSTValue()
	{
		double temp=(getTotalValue() * getGst())/100;
		return temp;
	}
	
	public double getTaxedVal()
	{
		double temp= (getServiceTax() *getTotalValue())/100; 
		return temp;
	}
	public void setTotalBill(double totalBill)
	{
		this.totalBill=totalBill;
	}
	public double getTotalBill() {
		this.totalBill=getNettedVal()-getDiscountedVal()+getTaxedVal();
		return totalBill;
	}
	

	@Override
	public String toString() {
		return "TotalValue =  " + totalValue 
		  + "\nDiscount   =  " + discount+" %" 
		  + "\nNetValue   =  " + netValue 
		  + "\nGST	   =  " + gst+" %"
		  + "\nServiceTax =  " + serviceTax+" %"
		  + "\nTotal Bill =  " + totalBill;
	}
	
	
}
