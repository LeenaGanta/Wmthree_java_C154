package typesOfWorkers;

public class DailyWorker extends Worker
{

	public DailyWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}
	
	public int pay(int hours)
	{
		int amount=hours*getSalaryRate();
		return amount;
	}

}
