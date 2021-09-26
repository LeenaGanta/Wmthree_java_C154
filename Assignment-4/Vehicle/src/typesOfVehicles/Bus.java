package typesOfVehicles;

public class Bus extends Vehicle
{

	public Bus(String model, String color, int numOfWheels) {
		super(model, color, numOfWheels);
		
	}

	public void display()
	{
		System.out.println("Bus goes zooom......");
	}

}
