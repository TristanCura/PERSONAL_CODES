//This is a child class, it extends the parent class vehicle and inherits is properties
//It also overrides the stop method to add its own value

public class Fandango_Yacth extends Vehicle{

	String name = "FUNdango Yacth";
	String speed = "Speed: 20";
	String color = "Color: White";
	String price = "Price: 200000";
	String mainSailColor = "Main Sail Color: pink";
	
	void Float() {
		System.out.println("Floating");
	}
	
	@Override
	void stop() {
		System.out.println("Hui lumubog...");
	}
	
}
