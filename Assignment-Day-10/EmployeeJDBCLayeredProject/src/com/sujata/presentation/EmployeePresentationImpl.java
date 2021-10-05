package com.sujata.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.exceptions.EmployeeNotFoundException;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee");
		System.out.println("3. Add Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Salary");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		switch (choice) {
		case 1:
			  ArrayList<Employee> employees=employeeService.getAllEmployees();
				for(Employee employee:employees) 
					System.out.println(employee);
			  break;
		case 2:
			System.out.println("Enter Employee Id: ");
			int id=Integer.parseInt(br.readLine());
			Employee emp=employeeService.searchEmployee(id);
			System.out.println(emp);
			break;
			
		case 3:
			System.out.println("Enter Employee Id: ");
			int id3=Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Name: ");
			String name=br.readLine();
			System.out.println("Enter Employee Designation: ");
			String desgn=br.readLine();
			System.out.println("Enter Employee Department: ");
			String dept=br.readLine();
			System.out.println("Enter employee salary: ");
			int sal=Integer.parseInt(br.readLine());
			Employee employee=new Employee(id3, name, desgn, dept, sal);
			boolean status=employeeService.insertEmployee(employee);
			if(status)
				System.out.println("Employee Registered Successfully");
			break;
		case 4:
			System.out.println("Enter Employee Id: ");
			int id1=Integer.parseInt(br.readLine());
			boolean status1=employeeService.deleteEmployee(id1);
			if(status1)
				System.out.println("Employee deleted successfully");
			
			break;
		case 5:
			System.out.println("Enter the employee Id : ");
			int id2=Integer.parseInt(br.readLine());
			System.out.println("Enter the salary : ");
			int sal2=Integer.parseInt(br.readLine());
			boolean status2=employeeService.updateSalary(id2, sal2);
			if(status2)
				System.out.println("Employee Updated Successfully");
			break;
			
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
			
		default:
			break;
		}
		}
		catch(EmployeeNotFoundException exception)
		{
			System.out.println(exception.getMessage());
		}
		catch(ClassNotFoundException | IOException| SQLException  exception)
		{
			exception.getMessage();
		}

	}

}
