package com.persistence;

import java.sql.SQLException;


import com.beans.Bill;

public interface BillDao {

	Bill getBill(String mobileNumber) throws ClassNotFoundException, SQLException;
	boolean setBill(String phno,Bill bill) throws ClassNotFoundException, SQLException;
	int getDiscount(String voucherCode) throws ClassNotFoundException, SQLException;
	int getBillId() throws ClassNotFoundException, SQLException;
}
