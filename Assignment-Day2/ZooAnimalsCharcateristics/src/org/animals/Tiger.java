package org.animals;

public class Tiger 
{
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
		return false;
	}
	public boolean canClimb()
	{
		return false;
	}
    public String sound()
    {
    	return "Rore.....Tiger";
    }
}
