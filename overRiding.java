package runtimePolymoremises;
class method{
	void display()
	{
		System.out.println("Display On");
	}
}
public class overRiding extends method {
    void display() {
    	super.display();
    	System.out.println("Display Off");
    }
	public static void main(String[] args) {
		overRiding obj = new overRiding();
		obj.display();
	}

}
