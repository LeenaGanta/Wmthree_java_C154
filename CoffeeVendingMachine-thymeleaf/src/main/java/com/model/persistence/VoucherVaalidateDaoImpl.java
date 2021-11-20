package com.model.persistence;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("voucherDao")
public class VoucherVaalidateDaoImpl implements VoucherValidateDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean voucherValidate(String voucherId) {
		
		String query="SELECT VOUCHERNAME FROM VOUCHER WHERE VOUCHER_ID=?";
		try {
			 jdbcTemplate.queryForObject(query, String.class,voucherId);
			 return true;
		}
		catch(EmptyResultDataAccessException exc){
			return false;
		}
	}
	

}
