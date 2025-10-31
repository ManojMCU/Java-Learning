package abstractionMethod;

abstract class Bank {
	abstract void loan();
	abstract void acc();
	void atm() {
		System.out.println(" Atm sended");
	}
}

class Home extends Bank
{
	void loan() {
		System.out.println(" Home Loan given");
		
	}
	void acc() {
		System.out.println("Savings and loan account");
	}
}

class Educ extends Bank{
	void loan() {
		System.out.println("Edcation loan");
	}
	void acc() {
		System.out.println("Savings Account");
	}
}


public class Abstraction {

	public static void main(String[] args) {
	 Educ obj = new Educ();
	 Home ob = new Home();
	 obj.loan();
	 obj.acc();
	 obj.atm();
	 ob.loan();
	 ob.acc();
	 ob.atm();

	}

}
