package exceptions;

public class EmployeeList
{
	Employee[] employees;
	static int index=0;
	public static void setIndex(int index) {
		EmployeeList.index = index;
	}

	public static int getIndex() {
		return index;
	}

	private int totalNoOfEmployees;
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
