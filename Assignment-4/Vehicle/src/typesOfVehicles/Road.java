package typesOfVehicles;

public class Road 
{
	public static void main(String[] args) {
		
		Vehicle truck=new Truck("Mahindra","Red",6);
		Vehicle car=new Car("BMW","Black",4);
		Vehicle bus=new Bus("Honda","Blue",6);
		
		Vehicle[] vehicle={truck,car,bus};
		
		for(Vehicle v:vehicle)
		{
			v.display();
			System.out.println(v);	
		}	
	}
}
