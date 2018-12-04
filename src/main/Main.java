package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] Args) {
		ArrayList<Person> people = makeList();
		ArrayList<Person> people2 = new ArrayList<Person>();
		boolean writeTest;
		Write wtf = new Write();
		Read rtf = new Read();

		try {
			writeTest = wtf.bufferedWrite("C:\\Users\\Admin\\Documents\\people.txt", people);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			people2 = rtf.bufferedRead("C:\\Users\\Admin\\Documents\\people.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("------------------------");
		for (Person p : people2) {
			System.out.println(p.toString()); 
		} 

	}

	public static ArrayList<Person> makeList() {
		
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
		return people;
	}
}
