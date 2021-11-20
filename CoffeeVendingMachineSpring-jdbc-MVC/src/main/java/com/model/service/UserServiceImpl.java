package com.model.service;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.beans.User;
import com.model.persistence.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean userValidate(User user) {
		return userDao.userValidate(user.getMobileNo(),user.getName());
	}

	@Override
	public boolean addUser(User user) throws DuplicateKeyException  {
		return userDao.addUser(user);
	}

}
