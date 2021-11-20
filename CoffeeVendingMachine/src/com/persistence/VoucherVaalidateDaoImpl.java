package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VoucherVaalidateDaoImpl implements VoucherValidateDao {

	
	public Connection connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffeevendingmachine", "root", "admin");
		return connection;
	}
	@Override
	public boolean voucherValidate(String voucherId) throws ClassNotFoundException, SQLException {
		 Connection connection=connectDB();
			
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT VOUCHERNAME FROM VOUCHER WHERE VOUCHER_ID=?");
			preparedStatement.setString(1,voucherId);
			ResultSet resultSet=preparedStatement.executeQuery();
		
		return resultSet.next();
	}
	

}
