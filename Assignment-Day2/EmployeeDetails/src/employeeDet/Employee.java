package employeeDet;

public class Employee 
{
	private int empId,empAge,empExpInYrs;
	private String empName,empLocation,empDesgn;
	Employee(String name)
	{
		empName=name;
	}
	Employee(String name,int id)
	{
		empName=name;
		empId=id;
	}
	Employee(String name,int id,int age)
	{
		empName=name;
		empId=id;
		empAge=age;
	}
	Employee(String name,int id,String desn)
	{
		empName=name;
		empId=id;
		empDesgn=desn;
	}
	Employee(String name,int id,int age,String location)
	{
		empName=name;
		empId=id;
		empAge=age;
		empLocation=location;
	}
	Employee(String name,int id,int age,int experience)
	{
		empName=name;
		empId=id;
		empAge=age;
		empExpInYrs=experience;
	}
	Employee(String name,int id,String desn,int experience)
	{
		empName=name;
		empId=id;
		empDesgn=desn;
		empExpInYrs=experience;
	}
	Employee(String name,int id,int age,String location,int experience)
	{
		empName=name;
		empId=id;
		empAge=age;
		empLocation=location;
		empExpInYrs=experience;
	}
	Employee(String name,int id,int age,String location,String desn,int experience)
	{
		empName=name;
		empId=id;
		empAge=age;
		empLocation=location;
		empDesgn=desn;
		empExpInYrs=experience;
	}
	

}
