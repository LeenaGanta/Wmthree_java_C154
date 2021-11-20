package com.model.service;



import org.springframework.stereotype.Service;

import com.beans.Voucher;
import com.model.persistence.VoucherValidateDao;

@Service("voucherService")
public class VoucherServiceImpl implements VoucherService {

	VoucherValidateDao voucher;
	
	public VoucherServiceImpl(VoucherValidateDao voucher) {
		super();
		this.voucher = voucher;
	}

	@Override
	public Voucher isVoucher(String voucherId)  {
		return voucher.voucherValidate(voucherId);
	}

}
