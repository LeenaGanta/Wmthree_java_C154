package vandalurZoo;

import org.animals.Animal;
import org.animals.Deer;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Moneky;
import org.animals.Tiger;

public class Zoo 
{
	public static void main(String[] args) {
		Animal lion=new Lion();
		Animal tiger=new Tiger();
		Animal deer=new Deer();
		Animal monkey=new Moneky();
		Animal giraffe=new Giraffe();
		
		lion.setAge(25);
		lion.setColor("Gold");
		lion.setWeight(500);
		
		tiger.setAge(14);
		tiger.setColor("reddish brown");
		tiger.setWeight(550);
		
		
		monkey.setAge(20);
		monkey.setColor("brown");
		monkey.setWeight(240);
		
		deer.setAge(20);
		deer.setColor("Orange");
		deer.setWeight(300);
	
		giraffe.setAge(50);
		giraffe.setColor("Light Yellow");
		giraffe.setWeight(1400);
		
		System.out.println("Lion...............................");
		System.out.println("Lion climbs:"+lion.canClimb());
		System.out.println("Lion is vegetarian:"+lion.isVegetarin());
		System.out.println("Color: "+lion.getColor());
		System.out.println("Age: "+lion.getAge());
		System.out.println("Weight: "+lion.getWeight());
		System.out.println("Lion Sound:"+ lion.sound());
		System.out.println("Tiger...............................");
		System.out.println("Tiger climbs:"+tiger.canClimb());
		System.out.println("Tiger is vegetarian:"+tiger.isVegetarin());
		System.out.println("Tiger Sound:"+tiger.sound());
		System.out.println("Color: "+tiger.getColor());
		System.out.println("Age: "+tiger.getAge());
		System.out.println("Weight: "+tiger.getWeight());
		System.out.println("Monkey...............................");
		System.out.println("Monkey climbs:"+monkey.canClimb());
		System.out.println("Monkey is vegetarian:"+monkey.isVegetarin());
		System.out.println("Monkey Sound:"+monkey.sound());
		System.out.println("Color: "+monkey.getColor());
		System.out.println("Age: "+monkey.getAge());
		System.out.println("Weight: "+monkey.getWeight());
		System.out.println("Deer.................................");
		System.out.println("Deer climbs:"+deer.canClimb());
		System.out.println("Deer is vegetarian:"+deer.isVegetarin());
		System.out.println("Deer Sound:"+deer.sound());
		System.out.println("Color: "+deer.getColor());
		System.out.println("Age: "+deer.getAge());
		System.out.println("Weight: "+deer.getWeight());
		System.out.println("Giraffe..............................");
		System.out.println("Giraffe climbs:"+giraffe.canClimb());
		System.out.println("Giraffe is vegetarian:"+giraffe.isVegetarin());
		System.out.println("Giraffe Sound:"+giraffe.sound());
		System.out.println("Color: "+giraffe.getColor());
		System.out.println("Age: "+giraffe.getAge());
		System.out.println("Weight: "+giraffe.getWeight());
	
	}
}
