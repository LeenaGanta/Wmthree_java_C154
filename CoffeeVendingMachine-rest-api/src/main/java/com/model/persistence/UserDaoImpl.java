package com.model.persistence;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.User;
import com.model.helper.UserMapper;



@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User userValidate(String mobileNo,String name)  {
	
		    String query="SELECT * FROM USER WHERE PHNO=? and NAME=?";
		    try 
		    {
		    	User user=jdbcTemplate.queryForObject(query, new UserMapper(),mobileNo,name);
		    	return user;
		    }
		    catch(EmptyResultDataAccessException exc)
		    {
			return null;}
		   
		
	}

	@Override
	public boolean addUser(User user) throws DuplicateKeyException{
		
		String query="INSERT INTO USER VALUES(?,?)";
		int rows=jdbcTemplate.update(query,user.getName(),user.getMobileNo());
		if(rows>0)
			return true;
		return false;
	}
	

}
