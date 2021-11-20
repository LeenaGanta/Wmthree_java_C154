package com.model.persistence;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
	
	@Query("FROM User WHERE name=:name and mobileNo=:mobileNo ")
	ArrayList<User> userValidate(@Param("name") String name,@Param("mobileNo")String mobileNo);
	
	

}
