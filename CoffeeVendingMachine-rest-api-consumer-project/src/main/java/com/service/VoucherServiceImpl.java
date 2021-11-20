package com.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.client.RestTemplate;

import com.beans.Voucher;

import org.springframework.stereotype.Service;


@Service("voucherService")
public class VoucherServiceImpl implements VoucherService {

	@Autowired
	private RestTemplate RestTemplate;
	

	@Override
	public boolean isVoucher(String voucherId)  {
		 if(RestTemplate.getForObject("http://localhost:8080/voucher/"+voucherId,Voucher.class)!=null)
			 return true;
		 else
			  return false;
	}

}
