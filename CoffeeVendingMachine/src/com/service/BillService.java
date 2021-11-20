package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.Bill;

public interface BillService {

	Bill getBill(String mobileNumber,String voucherCode) throws ClassNotFoundException, SQLException;
	void setBillDetails(ArrayList<String> coffees) throws ClassNotFoundException, SQLException;
}
