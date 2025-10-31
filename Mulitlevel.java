package multilevelInheritance;

import java.util.Scanner;

class Parent {
	String user = "Parents";
	void user1() {
		System.out.println("Hi how are you");
	}
}

class Child extends Parent{
	String name;
	void user2()
	{
		user1();
		System.out.println("My name is:"+name);
		
	}
}

class GrandChild extends Child{
	int age;
	void user3() {
		user1();
		user2();
		System.out.println("My age is:"+ age);
	}
}
public class Mulitlevel {

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Name:");
		obj.name= scan.nextLine();
		System.out.println("Enter the Age:");
		obj.age= scan.nextInt();
		obj.user3();
		
	}

}
