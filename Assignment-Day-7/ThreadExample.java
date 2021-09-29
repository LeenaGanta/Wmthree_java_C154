package examples;

class ThreadClass extends Thread
{

	public ThreadClass() {
		super();
	}
	public ThreadClass(String name)
	{
		super(name);
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {	Thread.sleep(100);} catch(InterruptedException exc) {System.out.println(exc);}
			System.out.println("Name : "+Thread.currentThread().getName()+" i : "+i);
			System.out.println("Id : "+Thread.currentThread().getId());
			System.out.println("Status : "+Thread.currentThread().getState());
			System.out.println("Alive : "+Thread.currentThread().isAlive());
			System.out.println("Prioroty : "+Thread.currentThread().getPriority());
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
	
	
	
}
public class ThreadExample
{
	public static void main(String[] args) throws InterruptedException {
		ThreadClass thread1=new ThreadClass();
		
		ThreadClass thread2=new ThreadClass();
		ThreadClass thread3=new ThreadClass();
		ThreadClass thread4=new ThreadClass();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread4.start();
		
	}
	


}
