package org.animals;

public class Animal
{
	private int weight,age;
    private String color,animal;
    
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isVegetarin()
	{
		return true;
	}
	public boolean canClimb()
	{
		return false;
	}

    public String sound()
    {
    	return "Heenk..deer";
    }

	@Override
	public String toString() {
		return " Animal----" + animal +"\n[ weight=" + weight + ", age=" + age + ", color=" + color
				+ ", vegetarian =" +isVegetarin()+", Climbs ="+canClimb()+ ", Sound ="+sound()+ "]\n";
	}
}
