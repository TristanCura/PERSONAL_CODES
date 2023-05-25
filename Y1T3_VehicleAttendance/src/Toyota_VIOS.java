//This is a child class, it extends the parent class vehicle and inherits is properties
//It also overrides the stop method to add its own value

public class Toyota_VIOS extends Vehicle{

	String name = "Toyota VIOS";
	String speed = "Speed: 30";
	String color = "Color: Black";
	String price = "Price: 300000";
	String tireType = "Tire Type: yung malaki";
	
	void drive() {
		System.out.println("Driving");
	}
	
	@Override
	void stop() {
		System.out.println("Override Stop");
	}
	
}
