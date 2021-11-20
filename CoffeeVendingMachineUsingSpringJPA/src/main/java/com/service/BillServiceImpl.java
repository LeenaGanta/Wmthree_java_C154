package com.service;


import java.time.LocalDateTime;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.beans.Bill;


import com.beans.User;
import com.persistence.BillDao;


import com.persistence.UserDao;


@Service("billService")
public class BillServiceImpl implements BillService {

	@Autowired
	private BillDao billDao;
	
	@Autowired
	private UserDao userDao;
	

	@Override
	public Bill getBill(String mobileNumber,String voucherCode) {
		Bill bill=new Bill();
		User user=userDao.findById(mobileNumber).get();
		bill.setTotalValue(CoffeeServiceImpl.price);
		int discount=0;
		try {
			discount=billDao.getDiscount(voucherCode);
		}
		catch(NullPointerException exc)
		{
			discount=0;
		}
		
		bill.setDiscount(discount);
		bill.setGst(4);
		bill.setServiceTax(3);
		
	    billDao.save(new Bill(user,bill.getTotalValue(),bill.getDiscount(),bill.getNettedVal(), bill.getGst(),bill.getServiceTax(),bill.getTotalBill(),LocalDateTime.now()));
	    
	     
		return billDao.getBill(); 
	}

	@Override
	public void setBillDetails(ArrayList<String> coffees) {
//		int b1=billDao.getBillId();
//		for(int i=0;i<coffees.size();i++)
//		{
//			transactionDao.save(new BillDetails(b1, coffees.get(i)));
//			
//		}
//			
//		
	}

	


	
}
