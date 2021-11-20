package com.service;

import java.sql.SQLException;
import java.util.ArrayList;


import com.beans.Bill;
import com.persistence.BillDao;
import com.persistence.BillDaoImpl;
import com.persistence.BillDetailsDao;
import com.persistence.BillDetailsImpl;


public class BillServiceImpl implements BillService {


	private BillDao billDao=new BillDaoImpl();

	private BillDetailsDao transactionDao=new BillDetailsImpl();
	

	@Override
	public Bill getBill(String mobileNumber,String voucherCode) throws ClassNotFoundException, SQLException {
		Bill bill=new Bill();
		bill.setTotalValue(CoffeeServiceImpl.price);
		int discount=billDao.getDiscount(voucherCode);
		bill.setDiscount(discount);
		bill.setGst(4);
		bill.setServiceTax(3);
		
		
		if(billDao.setBill(mobileNumber,bill))
			return billDao.getBill(mobileNumber);
		return null;
	}


	@Override
	public void setBillDetails(ArrayList<String> coffees) throws ClassNotFoundException, SQLException {
		int billId=billDao.getBillId();
		for(int i=0;i<coffees.size();i++)
		{
			transactionDao.addBillDetails(billId, coffees.get(i));
		}
	}


	
}
