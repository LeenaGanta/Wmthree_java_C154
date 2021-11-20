package com.model.persistence;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.Voucher;
import com.model.helper.VoucherMapper;


@Repository("voucherDao")
public class VoucherVaalidateDaoImpl implements VoucherValidateDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Voucher voucherValidate(String voucherId) {
		
		String query="SELECT * FROM VOUCHER WHERE VOUCHER_ID=?";
		try {
			 Voucher voucher=jdbcTemplate.queryForObject(query,new VoucherMapper(),voucherId);
			 return voucher;
		}
		catch(EmptyResultDataAccessException exc){
			return null;
		}
	}
	

}
