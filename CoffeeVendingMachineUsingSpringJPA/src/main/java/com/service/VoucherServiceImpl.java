package com.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.VoucherValidateDao;

@Service("voucherService")
public class VoucherServiceImpl implements VoucherService {

	@Autowired
	private VoucherValidateDao voucher;

	@Override
	public boolean isVoucher(String voucherId){
		return voucher.voucherValidate(voucherId)!=null;
	}

}
