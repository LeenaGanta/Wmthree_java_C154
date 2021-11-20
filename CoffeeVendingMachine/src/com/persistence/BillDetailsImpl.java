package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.time.LocalDateTime;






public class BillDetailsImpl implements BillDetailsDao {

 
 LocalDateTime datetime=null;
	public Connection connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffeevendingmachine", "root", "admin");
		return connection;
	}

 
	@Override
	public boolean addBillDetails(int billId, String coffeeId) throws ClassNotFoundException, SQLException {
	Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO BILL_DETAILS(BILL_ID,COFFEE_ID,DATE) "
				+ "VALUES(?,?,now())");
		preparedStatement.setInt(1,billId);
		preparedStatement.setString(2, coffeeId);
		
		int rows=preparedStatement.executeUpdate();
		
		if(rows>=0)
			return true;
		else
			return false;
	}

}
