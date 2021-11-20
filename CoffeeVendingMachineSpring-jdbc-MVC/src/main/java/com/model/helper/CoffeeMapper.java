package com.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.CoffeeBeans;

public class CoffeeMapper implements RowMapper<String>{

	@Override
	public String mapRow(ResultSet rs, int rowNum) throws SQLException {
		String coffeeName=rs.getString("COFFEENAME");
		return coffeeName;
	}
	

}
