package com.beans;

import java.time.LocalDateTime;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Entity
public class Bill {
 
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billId;
	@Getter
	@Setter
	@OneToOne
	private User user;
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
	@Getter
	@Setter
	private LocalDateTime date;
	
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
		return "TotalValue  :  " + totalValue 
		  + "\nDiscount    :  " + discount+" %" 
		  + "\nNetValue    :  " + netValue 
		  + "\nGST	    :  " + gst+" %"
		  + "\nServiceTax  :  " + serviceTax+" %"
		  + "\nTotal Bill  :  " + totalBill
		  + "\nDate        :  " +date;
	}

	public Bill(User mobileNo,double totalValue, int discount, double netValue, int gst, int serviceTax, double totalBill,LocalDateTime date) {
		super();
		this.user=mobileNo;
		this.totalValue = totalValue;
		this.discount = discount;
		this.netValue = netValue;
		this.gst = gst;
		this.serviceTax = serviceTax;
		this.totalBill = totalBill;
		this.date=date;
	}
	
	
}
