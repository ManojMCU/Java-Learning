package accesModifier;

public class Sample {

	public String s = "Public access modifier - Hi - use anywhere like all package";//use anywhere like all package
	protected String t = "Protected access modifier - Hi - use only inside this package"; //use only inside this package
	String v = "Default access modifier - Hi - use only inside this package";//use only inside this package
	private String u = "Private access modifier - Hi - use only inside class";// use only inside class
	int a=23;
	static int b =345;
	void add()
	{
		int c = a+b;
		System.out.println(c);
	}
	public void method ()
	{
		System.out.println("hi peoples");
	}
	public static void main(String[] args) {
   Sample ob = new Sample();
   ob.add();
   System.out.println(ob.s);
   System.out.println(ob.t);
   System.out.println(ob.v);
   System.out.println(ob.u);
   ob.method();
   

	}

}
