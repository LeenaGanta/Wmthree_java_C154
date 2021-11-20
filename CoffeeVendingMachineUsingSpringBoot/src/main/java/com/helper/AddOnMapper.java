package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.AddOns;

public class AddOnMapper implements RowMapper<AddOns>{

	@Override
	public AddOns mapRow(ResultSet rs, int rowNum) throws SQLException {
		String addOnName=rs.getString("ADDONNAME");
		AddOns addOn=new AddOns(addOnName);
		return addOn;
	}
	

}
