package com.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.AddOns;

public class AddOnDetailsMapper implements RowMapper<AddOns> {

	@Override
	public AddOns mapRow(ResultSet rs, int rowNum) throws SQLException {
		String addOnName=rs.getString("ADDONNAME");
		double price=rs.getBigDecimal("price").doubleValue();
		AddOns addOn=new AddOns(addOnName, price);
		return addOn;
	}
	

}
