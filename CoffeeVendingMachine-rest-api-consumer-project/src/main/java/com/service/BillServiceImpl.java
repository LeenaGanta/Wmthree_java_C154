package com.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.beans.Bill;

@Service("billService")
public class BillServiceImpl implements BillService {
	
	@Autowired
	private RestTemplate RestTemplate;
	

	@Override
	public Bill[] getBill(String mobileNumber,String voucherCode) {
		return RestTemplate.getForObject("http://localhost:8080/bill/"+mobileNumber+"/"+voucherCode, Bill[].class);
	}

	
}
