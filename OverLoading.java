package complierTimePolymoresisam;

class Veichel{
	void bike() {
		System.out.println("two and three wheelers");
	}

	void bike(int a,int b) {
		System.out.println(a+b+" wheelers");
	}
	
	void bike(int a, int b, int c) {
		System.out.println(a+b+c+" wheelers");
	}
}

public class OverLoading {

	public static void main(String[] args) {
		Veichel obj = new Veichel ();
		obj.bike();
		obj.bike(1, 1);
		obj.bike(1, 1, 1);

	}

}
