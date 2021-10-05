package com.sujata.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords()throws ClassNotFoundException,SQLException;
	boolean insertData(Employee employee) throws ClassNotFoundException, SQLException;
	boolean deleteData(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
	boolean updateSalary(int empId,int salary) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
	Employee searchRecord(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
}
