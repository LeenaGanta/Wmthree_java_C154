package com.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.User;
import com.persistence.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean userValidate(String mobileNumber) {
		return userDao.userValidate(mobileNumber);
	}

	@Override
	public boolean addUser(User user)  {
		return userDao.addUser(user);
	}

}
