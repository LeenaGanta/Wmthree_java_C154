package com.persistence;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.beans.User;

public interface UserDao {
	
	boolean userValidate(String mobileNo) throws SQLException, ClassNotFoundException;
	boolean addUser(User user) throws ClassNotFoundException, SQLException,SQLIntegrityConstraintViolationException;

}
