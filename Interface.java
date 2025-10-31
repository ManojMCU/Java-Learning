package interfaces;

interface Pay // only abstract method and variable present this interface not common methods cann't be declared
{
	int a = 100;// public static final int a
	void payment();//public abstract void payment() this taken default
	void trans();//public abstract void trans() this taken default
}

interface NameOfBank{
	void name();
}
class Bank{
	void acc() {
		System.out.println("Savings Account");
	}
}
class Gpay extends Bank implements Pay,NameOfBank  //Using Implements we can use N number of interface
{
	 public void name() {
		 System.out.println("Hdfc");
	 }
	public void payment() {
		System.out.println("Via Gpay");
	}
	public void trans() {
		System.out.println("transation completed by Gpay");
	}
}

class Phonepe extends Bank implements Pay,NameOfBank {
	 public void name() {
		 System.out.println("SBI");
	 }
	public void payment() {
		System.out.println("Via Phonepe");
	}
	public void trans() {
		System.out.println("transation completed by Phonepe");
	}
}
public class Interface {

	public static void main(String[] args) {
	Phonepe obj = new Phonepe();
	Gpay ob = new Gpay();
	ob.payment();
	ob.trans();
	ob.name();
	ob.acc();
	obj.payment();
	obj.trans();
	obj.name();
	obj.acc();

	}

}
