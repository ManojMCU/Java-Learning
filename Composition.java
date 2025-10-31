package HasAcomposion;

class Student{
	Address obj;
	String name;
	 Student( String name,Address obj) {
		this.obj = obj;
		this.name=name;
	 }
	 void details() {
		System.out.println( name+" "+obj.doorNo+" "+obj.city+" "+obj.city);
	}
}
class Address{
	int doorNo;
	String streetName;
	String city;
	Address( int doorNo,String streetName,String city ){
		this.doorNo=doorNo;
		this.streetName=streetName;
		this.city=city;
	}
}

public class Composition {

	public static void main(String[] args) {
		Student ob = new Student("MAnoj", new Address(23,"1st street","Namakkal"));
		ob.details();
		Student ob1 = new Student("Karthi", new Address(24,"2nd street","Namakkal"));
		ob1.details();

	}

}
