package com.persistence;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
	
	@Query("SELECT name FROM User WHERE mobileNo=:mobileNo")
	String userValidate(@Param("mobileNo")String mobileNo);
	
	

}
