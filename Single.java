package singleInheritance;
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

public class Single {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Child obj = new Child();
		System.out.println("Enter the name:");
		obj.name = scan.nextLine();
		obj.user2();
		
	}

}
