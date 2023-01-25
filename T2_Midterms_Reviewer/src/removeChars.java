import java.io.*;

public class removeChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//b. Remove unnecessary characters
		//Using the cleaned text from item 1.a., replace all
		//unnecessary characters (any characters that is not a letter except hyphen (-)) with an
		//empty string. Write the output to cleaned.txt.
		
		File task2 = new File ("C:\\Users\\trist\\eclipse-workspace\\T2_Midterms_Reviewer\\no_numbers.txt");
		BufferedReader br = new BufferedReader(new FileReader(task2));

		File fileOut = new File ("cleaned.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
		
		try {
			String text;
			while (((text = br.readLine()) != null)) {
				String clean = (text.replaceAll("[~!@#$%^&*(-)_\\,\\.'\\\"]", ""));
				bw.write(clean);
				bw.write("\n");
				
			}	
			bw.flush();
			bw.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
