package com.beans;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Voucher {
	
	@Getter
	@Setter
	private String voucherId;
	@Getter
	@Setter
	private String voucherName;
	@Getter
	@Setter
	private int discount;

}
