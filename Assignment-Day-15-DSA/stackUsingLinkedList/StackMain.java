package stackUsingLinkedList;

public class StackMain
{
	public static void main(String[] args) {
		Stack stack=new Stack();
		Employee emp1=new Employee(121, "XYA","SE0", 25000);
		Employee emp2=new Employee(122, "mkn","SE1", 35000);
		Employee emp3=new Employee(126, "zeeba","SE2", 55000);
		Employee emp4=new Employee(128, "habi","SE3", 65000);
		Employee emp7=new Employee(121, "mayur","SE0", 25000);
		Employee emp9=new Employee(126, "zeeba","SE2", 55000);
		Employee emp8=new Employee(121, "mayur","SE0", 25000);
		Employee emp5=new Employee(129, "hknm","SE3", 65000);
		Employee emp6=new Employee(130, "mklm","SE3", 65000);
		
		stack.push(emp1);
		stack.push(emp2);
		stack.push(emp3);
		stack.push(emp4);
	    stack.push(emp7);
		stack.push(emp8);
		stack.push(emp9);
		stack.push(emp5);
		stack.push(emp6);

		
		stack.display();
		System.out.println("===================POP==========");
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	

}
