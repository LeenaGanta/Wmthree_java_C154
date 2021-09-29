package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter total number of employees:");
		int num=Integer.parseInt(br.readLine());
		EmployeeList empList=new EmployeeList(num);
		Employee employee=null;
	    EmployeeInput empInput=new EmployeeInput();
		try
		{
		while(num!=0)
		{
		  empInput.empInput(empList, employee);
		  num--;
		}
		}
		catch(EmployeeNameException exception)
		{
			System.out.println(exception.getMessage());
		}
		for(Employee emp:empList.getEmployees())
			System.out.println(emp);
	}

}
