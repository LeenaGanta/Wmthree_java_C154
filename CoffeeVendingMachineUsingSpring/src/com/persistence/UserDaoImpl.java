package com.persistence;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.User;



@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public boolean userValidate(String mobileNo)  {
	
		    String query="SELECT NAME FROM USER WHERE PHNO=?";
		    try 
		    {
		    	jdbcTemplate.queryForObject(query, String.class,mobileNo);
		    	return true;
		    }
		    catch(EmptyResultDataAccessException exc)
		    {
			return false;}
		   
		
	}

	@Override
	public boolean addUser(User user) throws DuplicateKeyException {
		
		String query="INSERT INTO USER VALUES(?,?)";
		int rows=jdbcTemplate.update(query,user.getName(),user.getMobileNo());
		if(rows>0)
			return true;
		return false;
	}
	

}
