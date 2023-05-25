//This is a child class, it extends the parent class vehicle and inherits is properties
//It also overrides the stop method to add its own value

public class U2_SpyPlane extends Vehicle{
	
	String name = "U-2 Spy Plane";
	String speed = "Speed: 50";
	String color = "Color: BlackPink";
	String price = "Price: 5000000";
	String wingSpan = "Wing Span: mahaba like 10km";
	
	void fly() {
		System.out.println("Flying");
	}
	
	@Override
	void stop() {
		System.out.println("Hui nahuhulog yung plane");
	}
	
}
