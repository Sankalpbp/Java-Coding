import java.util.*;

public class User {
		
	public String name;

	public User (String name) {
		this.name = name;
	}
	
	public void greet () {
		System.out.println("Welcome to the Java World, " + this.name + "\n");
	}

	public static void main (String [] args) {
			
		System.out.println("What is your name?");
		Scanner scanner = new Scanner (System.in);

		String name = scanner.next();

		if (name.equals("Alice") || name.equals("Bob")) {
			User user1 = new User (name);
			user1.greet();
		}
	}
}
