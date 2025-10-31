package conditions;

public class jumping {

	public static void main(String[] args) {
		for (int a=10;a>=5;a--) {
			System.out.println(a);
			if(a==5) {
				break;
			}
		}
		while(true)
		{
			System.out.println("java");
			break;
		}
		for (int a=10;a>0;a--) {
			
			if(a==5) {
               continue;
			}
			System.out.println(a);
			
		}
		int a=10;
		int b =20;
		while(a<b)
		{
			System.out.println("java");
			a++;
		}
		System.out.println("end");

	}

}
