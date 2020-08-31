import java.util.*;

public class Table {
		
	public int number;

	public Table (int number) {
		this.number = number;
	}

	public void printTable () {
		for (int i = 1; i <= 10; ++i) {
			System.out.println(this.number + " x " + i + " = " + this.number * i);
		}
	}

	public static void main (String[] args) {
			
		System.out.println("Enter the number: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		
		Table t = new Table (n);

		t.printTable();
	}
}
