package _04.predicate;

import java.util.function.Predicate;

public class PredicateTest4 {

	public static void main(String[] args) {
		Person person1 = new Person("can");
		Person person2 = new Person("can");

		Predicate<String> predicate = str -> person1.checkName(str);
		
		System.out.println(predicate.test("can"));

		Predicate<String> predicate2 = person1::checkName;

		System.out.println(predicate2.test("can"));
		
		Predicate<Person> predicate3 = person1::checkName;
		
		// Predicate<Person> predicate4 = Person::checkName; compiler error
		
		System.out.println(predicate3.test(person2));
	}

}

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean checkName(String name) {
		return this.name.equals(name);
	}

	public boolean checkName(Person person) {
		return this.name.equals(person.getName());
	}

}