package typesOfVehicles;

public class Vehicle 
{
	private String model,color;
	private int numOfWheels;
	public Vehicle(String model, String color, int numOfWheels) {
		super();
		this.model = model;
		this.color = color;
		this.numOfWheels = numOfWheels;
	}
	public void display()
	{
		System.out.println(" Vehicle type");
	}
	@Override
	public String toString() {
		return "model=" + model + ", color=" + color + ", numOfWheels=" + numOfWheels;
	}
	
	

}
