package com.persistence;




import com.beans.User;

public interface UserDao {
	
	boolean userValidate(String mobileNo);
	boolean addUser(User user) ;

}
