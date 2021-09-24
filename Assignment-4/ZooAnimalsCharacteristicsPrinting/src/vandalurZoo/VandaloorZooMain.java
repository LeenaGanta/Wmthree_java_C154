package vandalurZoo;

import org.animals.Animal;

public class VandaloorZooMain
{
	public static void main(String[] args) {
		VandalurZoo zoo=new VandalurZoo();
		zoo.setCharacteristics();
	    for(Animal i:zoo.getAnimals())
	    {
	    	System.out.println(i);
	    }
	}

	
}
