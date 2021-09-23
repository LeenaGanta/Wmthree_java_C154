package employeeDet;

public class EmployeeMain 
{
	public static void main(String[] args) {
		Employee emp1=new Employee("leena");
		Employee emp2=new Employee("leena",123);
		Employee emp3=new Employee("leena",123,21);
		Employee emp4=new Employee("leena",123,"Software Engineer");
		Employee emp5=new Employee("leena",123,21,"Vijayawada");
		Employee emp6=new Employee("leena",1,21,123);
		Employee emp7=new Employee("leena",123,21,1);
		Employee emp8=new Employee("leena",123,"Software Engineer",1);
		Employee emp9=new Employee("leena",123,21,"Vijayawada",1);
		Employee emp10=new Employee("leena",123,21,"Vijayawada","Software Engineer",1);
	}

}
