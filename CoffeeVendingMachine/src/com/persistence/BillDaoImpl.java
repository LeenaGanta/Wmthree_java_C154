package com.persistence;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.beans.Bill;



public class BillDaoImpl implements BillDao {
	
	public Connection connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffeevendingmachine", "root", "admin");
		return connection;
	}
	
	
	
	
	@Override
	public boolean setBill(String phoneNumber,Bill bill) throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO BILL(PHNO,TOTAL_VAL,DISCOUNT,NET_VAL,GST,SERVICETAX,TOTAL_BILL)"
				+ "VALUES(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, phoneNumber);
		preparedStatement.setBigDecimal(2,BigDecimal.valueOf( bill.getTotalValue()));
		preparedStatement.setInt(3,bill.getDiscount());
		preparedStatement.setBigDecimal(4,BigDecimal.valueOf(bill.getNettedVal()));
		preparedStatement.setInt(5, bill.getGst());
		preparedStatement.setInt(6,bill.getServiceTax());
		preparedStatement.setBigDecimal(7, BigDecimal.valueOf(bill.getTotalBill()));
		
		
		int rows=preparedStatement.executeUpdate();
		
		if(rows>0)
			return true;
		else
			return false;
		
		
		
	}
	
	public int getDiscount(String voucherCode) throws ClassNotFoundException, SQLException
	{
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT DISCOUNT FROM VOUCHER WHERE VOUCHER_ID=?");
		preparedStatement.setString(1, voucherCode);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		int discount=0;
		while(resultSet.next())
			discount=resultSet.getInt("DISCOUNT");
		connection.close();
		
		return discount;
		
		
	}

	
	
	@Override
	public Bill getBill(String mobileNumber) throws ClassNotFoundException, SQLException {
		 Connection connection=connectDB();
			
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM BILL ORDER BY BILL_ID DESC LIMIT 1");
			ResultSet resultSet=preparedStatement.executeQuery(); 
			
			Bill completeBill=null;
			while(resultSet.next())
			{
				String phoneNumber=resultSet.getString("PHNO");
				if(phoneNumber.equals(mobileNumber))
				{
					double totalVal=resultSet.getBigDecimal("TOTAL_VAL").doubleValue();
					int discount=resultSet.getInt("DISCOUNT");
					double netValue=resultSet.getBigDecimal("NET_VAL").doubleValue();
					int gst=resultSet.getInt("GST");
					int serviceTax=resultSet.getInt("SERVICETAX");
					double totalBill=resultSet.getBigDecimal("TOTAL_BILL").doubleValue();
					completeBill=new Bill(totalVal, discount, netValue, gst, serviceTax, totalBill);
					connection.close();
					return completeBill;
				}
			}
			return completeBill;
		
			
	}
	@Override
	public int getBillId() throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT BILL_ID FROM BILL ORDER BY BILL_ID DESC LIMIT 1");
		ResultSet resultSet=preparedStatement.executeQuery(); 
		
		int billId=0;
		while(resultSet.next())
			billId=resultSet.getInt("BILL_ID");
		connection.close();
		
		
		return billId;
		
		
	}

}
