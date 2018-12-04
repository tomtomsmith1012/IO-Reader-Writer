package ioTest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import main.Main;
import main.Person;
import main.Read;
import main.Write;

public class IOTest {

	@Test
	public void testWrite() {
		Write wtf = new Write();
		ArrayList<Person> people = new ArrayList<Person>();
		Person person1 = new Person("A", "Z", 1);
		Person person2 = new Person("B", "Y", 2);
		Person person3 = new Person("C", "X", 3);
		Person person4 = new Person("D", "W", 4);
		Person person5 = new Person("E", "V", 5);
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);

		boolean checkWrite = true;
		try {
			assertTrue("Boolean was False",
					checkWrite = wtf.bufferedWrite("C:\\Users\\Admin\\Documents\\people.txt", people));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void testRead() {
		Read rtf = new Read();
		ArrayList<Person> testPeople = new ArrayList<Person>();
		Person person1 = new Person("A", "Z", 1);
		testPeople.add(person1);
		try {
			assertEquals(testPeople.get(0).toString(),
					rtf.bufferedRead("C:\\Users\\Admin\\Documents\\testread.txt").get(0).toString());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Test
	public void testList() {
		Person person1 = new Person("Bob", "Builder", 30);
		Person person2 = new Person("Sam", "Fireman", 28);
		Person person3 = new Person("Ben", "Flowerpot Man", 25);
		Person person4 = new Person("Bill", "Flowerpot Man", 25);
		Person person5 = new Person("Pat", "Postman", 32);
		ArrayList<Person> expected = new ArrayList<Person>();
		expected.add(person1);
		expected.add(person2);
		expected.add(person3);
		expected.add(person4);  
		expected.add(person5);
		
		assertEquals(expected.toString(), Main.makeList().toString());

	}
}
