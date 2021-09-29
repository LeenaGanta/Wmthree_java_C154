package coursesForEmployees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain extends CourseList
{
	public static void main(String[] args) throws NumberFormatException, IOException {

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
		
		System.out.println("Enter total no of employees : ");
		int total=Integer.parseInt(br.readLine());
		
		EmployeeList employeeList=new EmployeeList(total);
		CourseList courseList=new CourseList();
		courseList.setCourses();
		CourseDetails course=null;	
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter employee id : ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter employee Name : ");
			String name=br.readLine();
			System.out.println("Select courses Spring Boot,Java,PGP DataScience,MBA");
		    String courseName=br.readLine();
		    
			if(courseName.equals("Spring Boot"))
			{	course=courseList.c1;System.out.println("1");}
		    else if(courseName.equals("Java"))
		    {	course =courseList.c2;}
		    else if(courseName.equals("PGP DataScience"))
		    {	course =courseList.c3;}
		    else if(courseName.equals("MBA"))
		    {	course=courseList.c4;}
		    
		    Employee employee=new Employee(id,name,courseName,course);
		    employeeList.inputEmployee(employee, index);
		}
		
		for(Employee employee:employeeList.getEmployees())
		{
			System.out.println("=================================");
			System.out.println("Employee ID: "+employee.getEmpID()+" Employee Name: "+ employee.getEmpName());
			System.out.println(employee.getCourse());
			
		}
				
		
	} 

}
