package com.service;





import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.beans.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@Override
	public boolean userValidate(User user) {
		if(RestTemplate.getForObject("http://localhost:8080/users/"+user.getMobileNo()+"/"+user.getName(), User.class)!=null) return true;
		else return false;
	}

	@Override
	public boolean addUser(User user) throws DuplicateKeyException,HttpServerErrorException  {
		
		RestTemplate.postForObject("http://localhost:8080/users", user, User.class); return true;
		

		
	}

}
