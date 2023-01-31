import java.io.*;
import java.util.Scanner;
public class RegisterStudent {

	public void registerStudent() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=========================================================================================");
		System.out.println("\t\tSENIOR HIGH SCHOOL - K12");
		System.out.println("\tStudent Class Card Evaluation System");
		System.out.println("=========================================================================================");
	
		System.out.println("\nPERSONAL DATA");
		System.out.print("Enter Student#: \t");
		String sNo = input.nextLine();
		System.out.print("Enter First Name: \t");
		String fName = input.nextLine();
		System.out.print("Enter Last Name: \t");
		String lName = input.nextLine();
		System.out.print("Enter Course: \t\t");
		String course = input.nextLine();

		System.out.println("\n=========================================================================================");
		System.out.println("\t\tSubject: Computer Programming 2");
		System.out.println("=========================================================================================\n");
		
		System.out.print("Prelim Grade: \t\t");
		double prelG = input.nextDouble();
		System.out.print("Midterm Grade: \t\t");
		double midtG = input.nextDouble();
		System.out.print("Prefinal Grade: \t");
		double prefG = input.nextDouble();
		System.out.print("Final Grade: \t\t");
		double finG = input.nextDouble();
		
		System.out.println("\n=========================================================================================");
		
		double gwa = (prelG + midtG + prefG + finG) / 4;
		String pg = String.format("%.2f", prelG);
		String mg = String.format("%.2f", midtG);
		String pfg = String.format("%.2f", prefG);
		String fg = String.format("%.2f", finG);
		String genwa = String.format("%.2f", gwa);
		
		String name = sNo + "\t" + lName + "\t\t" + fName + "\t\t" + course + "\t" +
				pg + "\t" + mg + "\t" + pfg + "\t" + fg + "\t" + genwa;
		
		File file = null;
		BufferedWriter out = null;
		try {
			
			file = new File("student.txt");
			out = new BufferedWriter(new FileWriter(file,true));
			out.write(name);
			out.write("\r\n");
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				if(out != null) out.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("Student Evaluated Successfully...");
		System.out.println("Viewing Report...");
	}
}
