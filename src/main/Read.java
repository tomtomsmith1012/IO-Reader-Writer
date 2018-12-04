package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {

	
	public ArrayList<Person> bufferedRead(String inFile) throws IOException {
		BufferedReader bfrIn = new BufferedReader(new FileReader(inFile));
		ArrayList<Person> people2 = new ArrayList<Person>(); 
		String line;
		String name;
		String occupation;
		int age;
		

		while ((line = bfrIn.readLine()) != null) {
			Person p = new Person(null, null, 0); 
			String[] parts = line.split(", "); 
			name = parts[0];
			occupation = parts[1];
			age = Integer.parseInt(parts[2]);
			p.name = name;
			p.occupation = occupation;
			p.age = age;
			people2.add(p);  

		}
		bfrIn.close();
		return people2;
	}
}
