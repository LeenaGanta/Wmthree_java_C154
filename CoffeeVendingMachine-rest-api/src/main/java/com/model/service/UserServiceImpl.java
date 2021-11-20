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
	public User userValidate(String mobileNo,String name) {
		return userDao.userValidate(mobileNo, name);
	}

	@Override
	public User addUser(User user) throws DuplicateKeyException  {
		if(userDao.addUser(user))
			return user;
		else
			 return null;
	}

}
