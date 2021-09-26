package typesOfWorkers;

public class InheritedWorker extends Worker
{

	public InheritedWorker(String name, int salaryRate)
	{
		super(name, salaryRate);
	}
	public int pay(int hours)
	{
		int amount=40*getSalaryRate();
		return amount;
	}

}
