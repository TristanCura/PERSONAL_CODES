//This activity requires the student to implement inheritance and overriding
//to the subclasses of the vehicle like the car, boat, and plane.
//The student must also give each vehicle their own property value such as 
//the vehicles speed and price and methods such as fly or drive.

//This is the main class of the program wherein it access all the classes and methods and prints them. This is OOP.
public class VehiclesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toyota_VIOS car = new Toyota_VIOS();
		System.out.println(car.name);
		System.out.println(car.speed);
		System.out.println(car.color);
		System.out.println(car.price);
		System.out.println(car.tireType);
		
		car.drive();
		car.stop();
		System.out.println("\n");
		
		U2_SpyPlane plane = new U2_SpyPlane();
		System.out.println(plane.name);
		System.out.println(plane.speed);
		System.out.println(plane.color);
		System.out.println(plane.price);
		System.out.println(plane.wingSpan);
		
		plane.fly();
		plane.stop();
		System.out.println("\n");

		Fandango_Yacth boat = new Fandango_Yacth();
		System.out.println(boat.name);
		System.out.println(boat.speed);
		System.out.println(boat.color);
		System.out.println(boat.price);
		System.out.println(boat.mainSailColor);
		
		boat.Float();
		boat.stop();
		
	}

}
