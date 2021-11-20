package com.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.Bill;

public class BillMapper implements RowMapper<Bill> {

	@Override
	public Bill mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		double totalVal=resultSet.getBigDecimal("TOTAL_VAL").doubleValue();
		int discount=resultSet.getInt("DISCOUNT");
		double netValue=resultSet.getBigDecimal("NET_VAL").doubleValue();
		int gst=resultSet.getInt("GST");
		int serviceTax=resultSet.getInt("SERVICETAX");
		double totalBill=resultSet.getBigDecimal("TOTAL_BILL").doubleValue();
		Bill completeBill=new Bill(totalVal, discount, netValue, gst, serviceTax, totalBill);
		return completeBill;
	}

	

}
