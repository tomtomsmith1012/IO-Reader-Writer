package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] Args) {
		ArrayList<Person> people = new ArrayList<Person>();
		Person person1 = new Person("Bob", "Builder", 30);
		Person person2 = new Person("Sam", "Fireman", 28);
		Person person3 = new Person("Ben", "Flowerpot Man", 25);
		Person person4 = new Person("Bill", "Flowerpot Man", 25);
		Person person5 = new Person("Pat", "Postman", 32);

		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		try {
			bufferedWrite("C:\\Users\\Admin\\Documents\\people.txt", people);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			bufferedRead("C:\\Users\\Admin\\Documents\\people.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("------------------------");
		for (Person p : people) {
			System.out.println(p.toString());
		}
		
	}

	public static void bufferedWrite(String outFile, ArrayList<Person> people) throws IOException {

		BufferedWriter bfwOut = new BufferedWriter(new FileWriter(outFile));
		String out = null;

		for (Person p : people) {
			out = p.toString();
			System.out.println(out);
			bfwOut.write(out);
			bfwOut.newLine();
		}

		bfwOut.close();

	}

	public static ArrayList<Person> bufferedRead(String inFile) throws IOException {
		BufferedReader bfrIn = new BufferedReader(new FileReader(inFile));
		ArrayList<Person> people2 = new ArrayList<Person>();
		String line;
		String name;
		String occupation;
		int age;
		Person p = new Person(null, null, 0);
		
		while ((line = bfrIn.readLine()) != null) {
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
