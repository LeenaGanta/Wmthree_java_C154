package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees()throws ClassNotFoundException,SQLException;
	boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException;
	boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
	boolean updateSalary(int empId,int salary) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
	Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
}
