package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeInput
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void empInput(EmployeeList empList,Employee employee) throws EmployeeNameException, IOException
	{
		System.out.println("Enter employee name: ");
		String name=br.readLine();
		System.out.println("Enter age:");
		int age=Integer.parseInt(br.readLine());
		
		for(Employee emp:empList.getEmployees())
		{
			if(emp!=null) {
			if(name.equals(emp.getEmpName()))
			{
				throw new EmployeeNameException("Name already exists, Try another name");}}
		}
		 employee=new Employee(name,age);
		int index=EmployeeList.getIndex();
	    empList.inputEmployee(employee, index);
	    EmployeeList.setIndex(index+1);
	}

}
