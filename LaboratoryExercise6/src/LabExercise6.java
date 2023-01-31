import java.util.Scanner;

public class LabExercise6 {

	public static void main(String[] args) {
		System.out.println("Laboratory Exercise 6");
		System.out.println("File Handling Application\n");
		startPage();
		System.out.println("Program Terminated...");
	}

	public static void startPage() {
		RegisterStudent reg = new RegisterStudent();
		reg.registerStudent();
		ViewStudent view = new ViewStudent();
		view.viewStudent();
		afterStart();
		
	}

	public static void afterStart() {
		Scanner input = new Scanner(System.in);
		char exitChar, quitting = '@';
		String exit = null;
		do {
			try {
				System.out.println("Try Again(y/n)?: ");
				exit = input.next();
				int counter = 0;
				for (int i = 0; i <exit.length(); i++) {
					counter++;
				}
				if (counter == 1) {
					exitChar = exit.charAt(0);
					if(exitChar == 'y' || exitChar == 'Y') {
						RegisterStudent reg1 = new RegisterStudent();
						reg1.registerStudent();
						ViewStudent view1 = new ViewStudent();
						view1.viewStudent();
					}else if(exitChar == 'n' || exitChar == 'N') {
						quitting = '#';
					}else {
						throw (new StringException("You have entered an invalid choice."));
					}
				}else {
					throw (new StringException("You entered a string..."));
				}
			}catch(StringException ex) {
				System.out.println("\nYou typed: " + exit);
				System.out.println("\n" + ex.toString());
			}
		}while(quitting == '@');
		
	}
}
