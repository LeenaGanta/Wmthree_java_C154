package com.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CupSizeMapper implements  RowMapper<String> {

	@Override
	public String mapRow(ResultSet rs, int rowNum) throws SQLException {
		String cupSize=rs.getString("cup_size");
		return cupSize;
	}

}
