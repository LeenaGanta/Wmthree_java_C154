package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.CoffeeBeans;

public class CoffeeMapper implements RowMapper<CoffeeBeans>{

	@Override
	public CoffeeBeans mapRow(ResultSet rs, int rowNum) throws SQLException {
		String coffeeName=rs.getString("COFFEENAME");
		CoffeeBeans coffee=new CoffeeBeans(coffeeName);
		return coffee;
	}
	

}
