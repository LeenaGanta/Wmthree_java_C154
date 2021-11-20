package com.service;

import java.sql.SQLException;

import com.persistence.VoucherVaalidateDaoImpl;
import com.persistence.VoucherValidateDao;

public class VoucherServiceImpl implements VoucherService {

	VoucherValidateDao voucher=new VoucherVaalidateDaoImpl();


	@Override
	public boolean isVoucher(String voucherId) throws ClassNotFoundException, SQLException {
		return voucher.voucherValidate(voucherId);
	}

}
