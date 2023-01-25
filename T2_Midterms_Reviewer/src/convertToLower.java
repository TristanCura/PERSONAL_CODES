import java.io.*;

public class convertToLower {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//d. Convert to Lowercase
		//Create a method that will convert all characters in cleaned.txt to
		//lowercase using recursion. Write the output in a new file named final.txt
		
		File task4 = new File("C:\\Users\\trist\\eclipse-workspace\\T2_Midterms_Reviewer\\cleaned.txt");
		BufferedReader br = new BufferedReader(new FileReader(task4));
		
		File fileOut = new File("final.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
		
		try {
			String text;
			while (((text = br.readLine()) != null)) {
			System.out.println(convertMe(text));
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
	public static String convertMe(String s) {

		if(s.length()==0) {	
			return "";
		}
		if(s.)
	}
}


