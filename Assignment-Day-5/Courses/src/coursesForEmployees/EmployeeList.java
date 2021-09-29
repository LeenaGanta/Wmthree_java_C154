package coursesForEmployees;

public class EmployeeList 
{
	Employee[] employees;
	private int totalNoOfEmployees;
	private String courseName;
	public EmployeeList(int totalNoOfEmployees) {
		super();
		this.totalNoOfEmployees = totalNoOfEmployees;
		employees=new Employee[totalNoOfEmployees];
	}
	
	public void inputEmployee(Employee employee,int index) {
		employees[index]=employee;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}
	
	

}
