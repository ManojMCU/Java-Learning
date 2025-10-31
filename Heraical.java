package heraicalInheritance;

class School{
	void staff(){
		System.out.println("I am Staff");
	}
	void student() {
		System.out.println("I am Student");
	}
}
class Student extends School{
	void stud() {
		student();
		System.out.println("I studying...");
	}
}
class Teacher extends School{
	void teach() {
		staff();
		System.out.println("I am Teaching for students");
	}
}
public class Heraical {

	public static void main(String[] args) {
		Teacher ob=new Teacher();
		Student obj=new Student();
		ob.teach();
		obj.stud();
		
		
	}

}
