package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


import com.beans.User;



public class UserDaoImpl implements UserDao {

	
	public Connection connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffeevendingmachine", "root", "admin");
		return connection;
	}
	
	@Override
	public boolean userValidate(String mobileNo) throws SQLException, ClassNotFoundException {
	Connection connection=connectDB();
			
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT NAME FROM USER WHERE PHNO=?");
			preparedStatement.setString(1,mobileNo);
			ResultSet resultSet=preparedStatement.executeQuery();
			return resultSet.next();
		  
		
	}

	@Override
	public boolean addUser(User user) throws ClassNotFoundException, SQLException, SQLIntegrityConstraintViolationException {
	Connection connection=connectDB();
		
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO USER (NAME,PHNO) VALUES(?,?)");
		preparedStatement.setString(1, user.getName());
		preparedStatement.setString(2, user.getMobileNo());
		
		int rows=preparedStatement.executeUpdate();
		
		
		if(rows>0)
			return true;
		return false;
	}
	

}
