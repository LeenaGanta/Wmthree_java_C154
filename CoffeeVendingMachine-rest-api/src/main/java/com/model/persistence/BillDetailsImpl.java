package com.model.persistence;



import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("billDetails")
public class BillDetailsImpl implements BillDetailsDao {

 
 LocalDateTime datetime=null;
	
 	@Autowired
 	private JdbcTemplate jdbcTemplate;
 	


	@Override
	public boolean addBillDetails(int billId, String coffeeId)  {
	
		
		String query="INSERT INTO BILL_DETAILS(BILL_ID,COFFEE_ID,DATE)"
				+ "VALUES(?,?,now())";
		int rows=jdbcTemplate.update(query,billId,coffeeId);
		if(rows>=0)
			return true;
		else
			return false;
	}

}
