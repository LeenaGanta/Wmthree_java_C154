package com.model.persistence;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.beans.Voucher;

@Repository
public interface VoucherValidateDao extends JpaRepository<Voucher,String>
{
	@Query("Select voucherName FROM Voucher WHERE voucherId=:voucherCode")
	String voucherValidate(@Param("voucherCode")String voucherCode) ;

}
