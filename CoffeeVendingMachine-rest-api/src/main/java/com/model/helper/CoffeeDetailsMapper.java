package com.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.CoffeeBeans;

public class CoffeeDetailsMapper implements RowMapper<CoffeeBeans>{

	@Override
	public CoffeeBeans mapRow(ResultSet rs, int rowNum) throws SQLException {
		String coffeeName=rs.getString("coffeename");
		String cupSize=rs.getString("cup_size");
		double price=rs.getBigDecimal("coffeeprice").doubleValue();
		CoffeeBeans coffee=new CoffeeBeans(coffeeName, cupSize, price);
		return coffee;
	}
	

}
