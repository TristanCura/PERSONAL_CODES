import java.util.*; //Using asterisk(*) specifies all the classes instead of just calling out 1 class like 'import java.util.Scanner;'

public class classesAndObjects {

	private String name; //attribute 1
	private int age; //attribute 2
	private String course; //attribute 3

	//This method asks the user to input the data of the 3 attributes being name, age, and course
	
	public void classesAndObjects() { //This is the method being called out in the main class
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		this.name = in.nextLine();
		System.out.print("Enter age: ");
		this.age = in.nextInt();
		in.nextLine();
		System.out.print("Enter course: ");
		this.course = in.nextLine();
		
		displayClassmateDetails();
	}
	
	//This method prints the data that the user has imported using the Scanner class

	public void displayClassmateDetails() { 
		System.out.println("=======================================");
		System.out.println("This are the details of your classmates");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Course: " + this.course);
	}

	//these are the 3 attributes (or behavior), which are also called 'methods'
	
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getCourse() {
		return this.course;
	}
}
