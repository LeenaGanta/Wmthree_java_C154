package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {

	Scanner sc=new Scanner(System.in);
	public Connection connectDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiley_employee", "root", "admin");
		return connection;
	}
	@Override
	public ArrayList<Employee> getAllRecords()throws ClassNotFoundException,SQLException{
		Connection connection=connectDB();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
		ResultSet resultSet=preparedStatement.executeQuery();
		
		ArrayList<Employee> employees=new ArrayList<Employee>();

		while(resultSet.next()) {
			int empId=resultSet.getInt("EMP_ID");
			String na=resultSet.getString("NAME");
			String deptt=resultSet.getString("DEPARTMENT");
			String desig=resultSet.getString("DESIGNATION");
			int sal=resultSet.getInt("SALARY");
			Employee employee=new Employee(empId, na, deptt, desig, sal);
			employees.add(employee);
		}
		connection.close();
		return employees;
	}

	@Override
	public boolean insertData(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection=connectDB();
		
		
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE(EMP_ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES(?,?,?,?,?)");
		
		preparedStatement.setInt(1,employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getEmpDepartment());
		preparedStatement.setString(4, employee.getEmpDesignation());
		preparedStatement.setInt(5, employee.getEmpSalary());
		
		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>0)
			return true;
		else return false;
	}

	@Override
	public boolean deleteData(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE emp_id=?");
		preparedStatement.setInt(1, empId);
		
		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>0)
			return true;
		throw new EmployeeNotFoundException("Employee with id "+empId+" doesnot exist");
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=? WHERE EMP_ID=?");
		preparedStatement.setInt(1, salary);
		preparedStatement.setInt(2, empId);
		
		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>0)
			return true;
		throw new EmployeeNotFoundException("Employee with id "+empId+" doesnot exist");
	}

	@Override
	public Employee searchRecord(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		Connection connection=connectDB();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMP_ID=?");
		preparedStatement.setInt(1, empId);
		Employee employee=null;
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
				int empID=resultSet.getInt("EMP_ID");
				String na=resultSet.getString("NAME");
				String deptt=resultSet.getString("DEPARTMENT");
				String desig=resultSet.getString("DESIGNATION");
				int sal=resultSet.getInt("SALARY");
				employee=new Employee(empID, na, deptt, desig, sal);
				return employee;
		}
			connection.close();
		throw new EmployeeNotFoundException("Employee with id "+empId+" doesnot exist");
	}

}
