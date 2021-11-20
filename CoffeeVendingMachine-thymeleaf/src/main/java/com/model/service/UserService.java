package com.model.service;





import org.springframework.dao.DuplicateKeyException;

import com.beans.User;

public interface UserService {

	boolean userValidate(User user) ;
	boolean addUser(User user) throws DuplicateKeyException;
}
