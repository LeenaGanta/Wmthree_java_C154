package com.service;



import com.beans.User;

public interface UserService {

	boolean userValidate(String mobileNumber) ;
	boolean addUser(User user) ;
}
