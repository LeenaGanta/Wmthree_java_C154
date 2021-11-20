package com.model.service;





import org.springframework.dao.DuplicateKeyException;

import com.beans.User;

public interface UserService {

	User userValidate(String mobileNo,String name) ;
	User addUser(User user) throws DuplicateKeyException;
}
