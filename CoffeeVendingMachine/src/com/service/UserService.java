package com.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.beans.User;

public interface UserService {

	boolean userValidate(String mobileNumber) throws ClassNotFoundException, SQLException;
	boolean addUser(User user) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException;
}
