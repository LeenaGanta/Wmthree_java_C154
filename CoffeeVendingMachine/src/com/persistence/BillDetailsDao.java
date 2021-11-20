package com.persistence;

import java.sql.SQLException;

public interface BillDetailsDao {

	boolean addBillDetails(int billId,String coffeeId) throws ClassNotFoundException, SQLException;
}
