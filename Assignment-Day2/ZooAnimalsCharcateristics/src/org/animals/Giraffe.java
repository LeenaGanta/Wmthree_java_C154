package org.animals;

public class Giraffe {
	private int weight,age;
    private String color;
    
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
		return true;
	}
    public String sound()
    {
    	return "rooooooorrrrr... giraffe";
    }
}
