package com.persistence;


import java.util.ArrayList;

import com.beans.Bill;

public interface BillDao {

	ArrayList<Bill> getBill(String mobileNumber);
	boolean setBill(String phno,Bill bill) ;
	int getDiscount(String voucherCode) ;
	int getBillId() ;
}
