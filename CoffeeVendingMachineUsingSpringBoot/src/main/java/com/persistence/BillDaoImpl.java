package com.persistence;

import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.Bill;
import com.helper.BillMapper;


@Repository("billDao")
public class BillDaoImpl implements BillDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public boolean setBill(String phoneNumber,Bill bill) {
		
		String query="INSERT INTO BILL(PHNO,TOTAL_VAL,DISCOUNT,NET_VAL,GST,SERVICETAX,TOTAL_BILL)"
				+ "VALUES(?,?,?,?,?,?,?)";
		
		int rows=jdbcTemplate.update(query,phoneNumber,BigDecimal.valueOf( bill.getTotalValue()),bill.getDiscount(),
				BigDecimal.valueOf(bill.getNettedVal()),bill.getGst(),bill.getServiceTax(),BigDecimal.valueOf(bill.getTotalBill()));
		
		if(rows>0)
			return true;
		else
			return false;
		
		
		
	}
	
	public int getDiscount(String voucherCode) 
	{
		
		String query="SELECT DISCOUNT FROM VOUCHER WHERE VOUCHER_ID=?";
		try{
			int discount=jdbcTemplate.queryForObject(query, Integer.class,voucherCode);
			return discount;
		}
		catch(EmptyResultDataAccessException exc) {
			return 0;
		}
		
	}

	
	
	@Override
	public ArrayList<Bill> getBill(String mobileNumber)  {
		
		List<Bill> completeBill=new ArrayList<Bill>();
		String query="SELECT * FROM BILL ORDER BY BILL_ID DESC LIMIT 1";
		completeBill= jdbcTemplate.query(query, new BillMapper());
			
		return (ArrayList<Bill>) completeBill;
	}
	
	@Override
	public int getBillId() {
	
		
		String query="SELECT BILL_ID FROM BILL ORDER BY BILL_ID DESC LIMIT 1";
		int billId=jdbcTemplate.queryForObject(query, Integer.class);
		return billId;
		
		
	}

}
