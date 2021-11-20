package com.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.Voucher;

public class VoucherMapper implements RowMapper<Voucher> {

	@Override
	public Voucher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Voucher voucher=new Voucher(rs.getString("voucherName"),rs.getString("voucher_id"),rs.getInt("discount"));
		return voucher;
	}
	

}
