package com.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Bill;
import com.persistence.BillDao;
import com.persistence.BillDetailsDao;

@Service("billService")
public class BillServiceImpl implements BillService {

	@Autowired
	private BillDao billDao;
	@Autowired
	private BillDetailsDao transactionDao;
	
	
	

	public BillServiceImpl(BillDao billDao, BillDetailsDao transactionDao) {
		super();
		this.billDao = billDao;
		this.transactionDao = transactionDao;
	}


	@Override
	public ArrayList<Bill> getBill(String mobileNumber,String voucherCode) {
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
	public void setBillDetails(ArrayList<String> coffees) {
		int billId=billDao.getBillId();
		for(int i=0;i<coffees.size();i++)
		{
			transactionDao.addBillDetails(billId, coffees.get(i));
		}
	}


	
}
