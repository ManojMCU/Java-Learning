package HasAagricartion;
// this was HAS A method which was not strong relation bond build without the anyone mention in below it will operate.
class Lib{
	Books ob;
	void collection( Books ob) {
		this.ob=ob;
		System.out.println(ob.a+","+ob.b);
		System.out.println(ob.c+","+ob.d);
	}
}
class Books{
	String a = "Book Harry potter ch-1";
	String b = "Book Harry potter ch-2";
	String c;
	String d;
	Books( String c, String d){
		this.c=c;
		this.d=d;
	}
}

public class Agrication {

	public static void main(String[] args) {
		Books obj = new Books("Harry potter ch-3","Harry potter ch-4");
		Lib ob = new Lib();
		ob.collection(obj);

	}

}
