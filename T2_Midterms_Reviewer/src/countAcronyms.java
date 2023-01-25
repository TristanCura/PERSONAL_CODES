import java.io.*;

public class countAcronyms {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// c. Count Acronyms
		// Create a method that will count all acronyms that are found in
		// cleaned.txt. Use regular expressions. Print the total count in the console

		countAcro();
		
	}

	public static void countAcro()throws IOException {
		File task3 = new File("C:\\Users\\trist\\eclipse-workspace\\T2_Midterms_Reviewer\\cleaned.txt");
		BufferedReader br = new BufferedReader(new FileReader(task3));

		try {
			int i = 1;
			String text;
			String pattern = "(.[A-Z].])*";
			while (((text = br.readLine()) != null)) {
				if(text.matches(pattern)) {
					i++;
				}
			}
			System.out.println("Count of Acronyms: "+i);
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
