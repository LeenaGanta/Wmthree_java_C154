package com.model.persistence;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.beans.Bill;

@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {

	@Query("FROM Bill where billId=(select max(billId) from Bill)")
	Bill getBill();
	
	
	//boolean setBill(String phno,Bill bill) ;
	
	@Query("SELECT discount FROM Voucher WHERE voucherId=:voucherCode")
	Integer getDiscount(@Param("voucherCode")String voucherCode);
	
	@Query("SELECT billId FROM Bill where billId=(select max(billId) from Bill)")
	int getBillId() ;
}
