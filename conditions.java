package conditions;

public class conditions {

	public static void main(String[] args) {
	int mark = 99;
	if (mark >= 45 && mark <=55)
	{
		System.out.println("Just pass");
	}
	else if (mark >=55 && mark <=65)
	{
		System.out.println("C Grade");
		
	}
	else if (mark >=75 && mark <=85)
	{
		System.out.println("B Grade");
		
	}
	else if (mark >=85 && mark <=95)
	{
		System.out.println("A Grade");
		
	}
	else if (mark >=95 && mark <100)
	{
		System.out.println("S Grade");
		
	}
	else
	{
		System.out.println("Fail");
	}
	
	 int per = 80;
	 int rank = 5;
	 if (mark >= 90)
	 {
			System.out.println("Selected for first round");
			if (per >60)
			{
				System.out.println("Selected for Second round");
				if (rank <10) {
					System.out.println("Selected for Third round");
				}
				else {
					System.out.println("Not  Selected for Third round");
				}
			}
			else
			{
				System.out.println("not Selected for Second round");
			}
	 }
	 else {
			System.out.println("not selected for first round");
	 }
	 
	 byte r =0;
			 switch(r)
			 {
			 case 1:
			 System.out.println("one");
			 break;
			 case 2:
				 System.out.println("two");
				 break;
			 case 10:
				 System.out.println("ten");
				 break;
			default:
				System.out.println("value not found");
			 }
	}

}
