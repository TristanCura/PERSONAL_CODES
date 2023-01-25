import java.io.*;

public class removeNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// a. Removing Numbers
		// Read the file named article.txt then replace all the numbers with an empty
		// string
		// using Java regular expression. Write the cleaned text in a new file named
		// no_numbers.txt.

		File task1 = new File("C:\\Users\\trist\\eclipse-workspace\\T2_Midterms_Reviewer\\article.txt");
		BufferedReader br = new BufferedReader(new FileReader(task1));

		File fileOut = new File ("no_numbers.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
		
		try {
			String text;
			while (((text = br.readLine()) != null)) {
				String clean = (text.replaceAll("\\d", ""));
				bw.write(clean);
				bw.write("\n");
				
			}	
			bw.flush();
			bw.close();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
