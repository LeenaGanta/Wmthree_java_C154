package typesOfWorkers;

public class Worker 
{
	private String name;
	private int salaryRate;
	public Worker(String name, int salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}
	public int pay(int hours)
	{
		return 1;
	}
	public int getSalaryRate() {
		return salaryRate;
	}
	public String getName() {
		return name;
	}
	
}
