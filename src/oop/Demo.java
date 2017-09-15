package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {
	
	public static void main(String[] args){
		// Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "7897897894";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		
		person2.sleep();
		
		
		/*Person-
		
		//Attributes, variables,adjectives, descriptors
		String name = "Joe";
		String email = "joe@testmail.com";
		String phone = "7897894564";
		
		//Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//do this for another person
		String name2 = "Sarah";
		String email2 = "sarah@testmail.com";
		String phone2 = "3213216548";
		
		//Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
	}
	
	// Enhance by adding function to enhance code
	static void walking(String name){
		System.out.println(name + " is walking");
		*/
	}

}
