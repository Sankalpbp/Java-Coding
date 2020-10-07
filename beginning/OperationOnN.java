import java.util.*;

public class OperationOnN {

	public int n;

	public int add = 1;
	public int multiply = 2;

	public OperationOnN (int n) {
		this.n = n;
	}

	public int operation () {
			
		System.out.println("Choose the operation that you want to: ");
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");

		Scanner input = new Scanner (System.in);
		int choice = input.nextInt();

		int output = 0;
		if (choice == add) {
			output = 0;
			for (int i = 1; i <= this.n; ++i) {
				output += i;
			}
		} else if (choice == multiply) {
			output = 1;
			for (int i = 1; i <= this.n; ++i) {
				output *= i;
			}
		}

		return output;
	}
		
	public static void main (String[] args) {
			
		System.out.println("Enter the number of elements: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		OperationOnN o = new OperationOnN(n);

		System.out.println(o.operation() + "\n");
	}
}
