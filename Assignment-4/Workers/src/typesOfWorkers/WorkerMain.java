package typesOfWorkers;

public class WorkerMain
{
	public static void main(String[] args) {
		Worker dailyWorker=new DailyWorker("Himesh", 500);
		System.out.println("Daily Worker--------------------------------------------");
		System.out.println("Name: "+dailyWorker.getName()+"\nSalary: "+dailyWorker.pay(35));
		Worker inheritedWorker=new InheritedWorker("Lakshmi", 10000);
		System.out.println("Inherited Work-------------------------------------------");
		System.out.println("Name: "+inheritedWorker.getName()+"\nSalary: "+inheritedWorker.pay(35));
	}

}
