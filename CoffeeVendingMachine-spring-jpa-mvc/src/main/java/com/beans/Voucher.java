package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Voucher {
	
	@Getter
	@Setter
	@Id
	private String voucherId;
	@Getter
	@Setter
	private String voucherName;
	@Getter
	@Setter
	private int discount;

}
