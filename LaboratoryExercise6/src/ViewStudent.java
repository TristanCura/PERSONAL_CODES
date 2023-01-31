import java.io.*;

public class ViewStudent {

	public void viewStudent() {
		File fileIn;
		BufferedInputStream in = null;
		try {
			fileIn = new File("student.txt");
			in = new BufferedInputStream(new FileInputStream(fileIn));
			int byteRead;
			int counter = 0;
			while((byteRead = in.read()) != -1) {
				if(counter == 0) {
					System.out.println();
					System.out.println("=========================================================================================");
					System.out.println("ID NO.\tLAST NAME\tFIRST NAME\tCOURSE\tPG\tMG\tPFG\tFG\tGWA");
					System.out.println("=========================================================================================");
					counter = 1;
				}
				System.out.printf("%c", (char)byteRead);
			}
			in.close();
			System.out.println("=========================================================================================");
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
