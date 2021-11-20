package com.service;


import java.util.ArrayList;

import com.beans.Bill;

public interface BillService {

	ArrayList<Bill> getBill(String mobileNumber,String voucherCode) ;
	void setBillDetails(ArrayList<String> coffees) ;
}
