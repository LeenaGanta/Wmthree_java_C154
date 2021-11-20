package com.service;

import java.sql.SQLException;


import org.springframework.stereotype.Service;

import com.persistence.VoucherValidateDao;

@Service("voucherService")
public class VoucherServiceImpl implements VoucherService {

	VoucherValidateDao voucher;
	
	public VoucherServiceImpl(VoucherValidateDao voucher) {
		super();
		this.voucher = voucher;
	}

	@Override
	public boolean isVoucher(String voucherId) throws ClassNotFoundException, SQLException {
		return voucher.voucherValidate(voucherId);
	}

}
