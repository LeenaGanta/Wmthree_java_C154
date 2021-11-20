package com.model.persistence;





import org.springframework.dao.DuplicateKeyException;

import com.beans.User;

public interface UserDao {
	
	boolean userValidate(String mobileNo, String name);
	boolean addUser(User user) throws DuplicateKeyException ;

}
