package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		return employeeDao.insertData(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		return employeeDao.updateSalary(empId, salary);
	}

	@Override
	public Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		return employeeDao.searchRecord(empId);
	}

}
