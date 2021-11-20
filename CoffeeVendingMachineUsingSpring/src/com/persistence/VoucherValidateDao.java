package com.persistence;

import java.sql.SQLException;


public interface VoucherValidateDao
{
	boolean voucherValidate(String voucherId) throws ClassNotFoundException, SQLException;

}
