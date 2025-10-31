package conditions;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
// for (int i =1; i<=5; i++)
// {
//	System.out.println("enter Username:" + i);
//	String name= scan.nextLine();
//	System.out.println("User Name:"+ name +" welcome to the game");
//	
// }
		for (int i=1;i<=5;i++)
		{
			System.out.println(i + "*");
		}
		int a =10;
				while (a>5) {
					System.out.println("hello");
					a--;
				}
				
				int enterPin;
				int correctPin =1233;
				do {
					System.out.println("enter Pin num");
					enterPin = scan.nextInt();
					if (enterPin != correctPin)
					{
						System.out.println("enter the pin num was incorrect");
					}
					
				}while(enterPin != correctPin);
				System.out.println("you enter the correct pin");
	}
	
	

}
