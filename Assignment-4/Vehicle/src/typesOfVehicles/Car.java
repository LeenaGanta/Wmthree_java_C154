package typesOfVehicles;

public class Car extends Vehicle
{

	public Car(String model, String color, int numOfWheels) {
		super(model, color, numOfWheels);
	}
	

	public void display()
	{
		System.out.println("Car goes vrooom......");
	}

}
