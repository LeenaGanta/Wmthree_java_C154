package com.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


import com.beans.User;
import com.persistence.UserDao;
import com.persistence.UserDaoImpl;

public class UserServiceImpl implements UserService {


	private UserDao userDao=new UserDaoImpl();
	
	
	

	@Override
	public boolean userValidate(String mobileNumber) throws ClassNotFoundException, SQLException {
		return userDao.userValidate(mobileNumber);
	}

	@Override
	public boolean addUser(User user) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException {
		return userDao.addUser(user);
	}

}
