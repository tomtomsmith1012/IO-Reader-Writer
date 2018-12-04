package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Write {

	
	public boolean bufferedWrite(String outFile, ArrayList<Person> people) throws IOException {

		BufferedWriter bfwOut = new BufferedWriter(new FileWriter(outFile));
		String out = null;

		try {
			for (Person p : people) {
				out = p.toString();
				System.out.println(out);
				bfwOut.write(out);
				bfwOut.newLine();  
			}
		} catch (Exception e) {
			bfwOut.close();
			return false;
		}

		bfwOut.close();
		return true; 
 
	}
}
