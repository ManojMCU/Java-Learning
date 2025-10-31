package constructors;

public class con1 {
	int rollNo;
	String name;
	con1 (int rollno1, String name1)
	{
		rollNo=rollno1;
		name=name1;
		System.out.println("student "+name+"details got");
	}

	public static void main(String[] args) {
		con1 ob = new con1(1,"mj");

	}

}
