package vandalurZoo;

import org.animals.Animal;
import org.animals.Deer;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Moneky;
import org.animals.Tiger;

public class VandalurZoo
{
	Animal lion=new Lion();
	Animal tiger=new Tiger();
	Animal deer=new Deer();
	Animal monkey=new Moneky();
	Animal giraffe=new Giraffe();
	
	void setCharacteristics()
	{
	lion.setAnimal("lion");
	lion.setAge(25);
	lion.setColor("Gold");
	lion.setWeight(500);
	
	tiger.setAnimal("tiger");
	tiger.setAge(14);
	tiger.setColor("reddish brown");
	tiger.setWeight(550);
	
	monkey.setAnimal("monkey");
	monkey.setAge(20);
	monkey.setColor("brown");
	monkey.setWeight(240);
	
	
	deer.setAnimal("deer");
	deer.setAge(20);
	deer.setColor("Orange");
	deer.setWeight(300);

	giraffe.setAnimal("giraffe");
	giraffe.setAge(50);
	giraffe.setColor("Light Yellow");
	giraffe.setWeight(1400);

	}
	
	
	Animal[] animal= {lion,tiger,deer,monkey,giraffe};
	public Animal[] getAnimals() {
		return animal;
	}

}
