package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class CoffeeDaoImpl implements CoffeeDao{

	
	
   
	public Connection connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffeevendingmachine", "root", "admin");
		return connection;
	}
	
	
	@Override
	public double addCoffee(String coffee,String size) throws ClassNotFoundException, SQLException {
         Connection connection=connectDB();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT COFFEEPRICE FROM COFFEE WHERE COFFEENAME=? AND CUP_SIZE=?");
		preparedStatement.setString(1,coffee);
		preparedStatement.setString(2,size);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		double price1=0;
		while(resultSet.next())
		price1=resultSet.getBigDecimal("COFFEEPRICE").doubleValue();
		
		
		return price1;
	}

	@Override
	public ArrayList<String> getCoffeeDetails() throws ClassNotFoundException, SQLException {
         Connection connection=connectDB();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT DISTINCT COFFEENAME FROM COFFEE");
		ResultSet resultSet=preparedStatement.executeQuery(); 
		
		
		List<String> coffee=new ArrayList<>();
		while(resultSet.next())
		{
			String coffeeName=resultSet.getString("COFFEENAME");
			coffee.add(coffeeName);
		}
		connection.close();
		
		
		return (ArrayList<String>) coffee;
	}

	



	@Override
	public ArrayList<String> getAddOnDetails() throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
			
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM ADDON");
			ResultSet resultSet=preparedStatement.executeQuery(); 
			
			ArrayList<String> addOns=new ArrayList<String>();
			while(resultSet.next())
			{
				String addOn=resultSet.getString("ADDONNAME");
				addOns.add(addOn);
			}
			connection.close();
		
			return addOns;
	}

	@Override
	public double addAddOn(String addOn) throws SQLException, ClassNotFoundException {

		Connection connection=connectDB();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT PRICE FROM ADDON WHERE ADDONNAME=?");
		preparedStatement.setString(1,addOn);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		  
		double price1=0;
		while(resultSet.next())
		price1=resultSet.getDouble("PRICE");
		connection.close();
		return price1;
		
		
		
	}

	
	@Override
	public String getCoffeeId(String coffee,String size) throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT COFFEE_ID FROM COFFEE WHERE COFFEENAME=? AND CUP_SIZE=? ");
		preparedStatement.setString(1, coffee);
		preparedStatement.setString(2, size);
		ResultSet resultSet=preparedStatement.executeQuery();
		String coffeeID="";
		while(resultSet.next())
			coffeeID=resultSet.getString("COFFEE_ID");
		connection.close();
		
		
		return coffeeID;
	}


	@Override
	public String getAddOnId(String addon) throws ClassNotFoundException, SQLException {
	Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT ADDON_ID FROM ADDON WHERE ADDONNAME=?");
		preparedStatement.setString(1, addon);
		ResultSet resultSet=preparedStatement.executeQuery();
		String addonId="";
		while(resultSet.next())
			addonId=resultSet.getString("COFFEE_ID");
		connection.close();
		
		
		return addonId;
	}


	@Override
	public String getCoffeeName(String coffeeId) throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT COFFEENAME FROM COFFEE WHERE COFFEE_ID=?");
		preparedStatement.setString(1, coffeeId);
		ResultSet resultSet=preparedStatement.executeQuery();
		String coffeeName="";
		while(resultSet.next())
			coffeeName=resultSet.getString("COFFEENAME");
		connection.close();
		
		return coffeeName;
	}


	@Override
	public String getCoffeeSize(String coffeeId) throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT CUP_SIZE FROM COFFEE WHERE COFFEE_ID=?");
		preparedStatement.setString(1, coffeeId);
		ResultSet resultSet=preparedStatement.executeQuery();
		String cupSize="";
		while(resultSet.next())
			cupSize=resultSet.getString("CUP_SIZE");
		connection.close();
		
		
		return cupSize;
	}


	
	
	
	
}


