package user_role;

public class Generalization {
	
	public static void main(String[] s) {
		
		Admin a = new Admin();
		a.name = "Person Name";
		System.out.println(a);
		
		
		Customer c = new Customer();
		c.name = "Person Name";
		c.address = "Person Address";
		System.out.println(c);
	}
}
