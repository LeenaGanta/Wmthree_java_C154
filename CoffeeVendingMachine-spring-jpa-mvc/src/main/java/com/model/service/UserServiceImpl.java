package com.model.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.User;
import com.model.persistence.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean userValidate(User user) {
		return userDao.userValidate(user.getName(),user.getMobileNo()) != null;
	}

	@Override
	public boolean addUser(User user)  {
		return userDao.save(new User(user.getName(), user.getMobileNo())) != null;
	}

}
