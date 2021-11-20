package com.service;

import java.sql.SQLException;

public interface VoucherService {
	boolean isVoucher(String voucherId) throws ClassNotFoundException, SQLException;

}
