package encapulasion;

public class Encapulasion {

	private int pass;
	private String userName;
	Encapulasion(int pass, String userName){
		this.pass=pass;
		this.userName=userName;
	}
	public int getPass() {
		return pass;
	}
	public String getUser() {
		return userName;
	}
	public void setPass(int pass) {
		this.pass=pass;
	}
	public void setUser(String userName) {
		this.userName=userName;
	} 
	public static void main(String[] args) {
		Encapulasion obj = new Encapulasion( 1223,"Manoj");
		obj.getPass();
		obj.getUser();
		System.out.println(obj.pass);
		System.out.println(obj.userName);
		obj.setPass(7890);
		obj.setUser("mano");
		System.out.println(obj.pass);
		System.out.println(obj.userName);
		
	}

}
