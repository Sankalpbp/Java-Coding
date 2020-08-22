import java.util.*;

public class SumOfN {

	public int n;

	public SumOfN (int n) {
		this.n = n;
	}

	public int add () {
			
		int sum = 0;
		for (int i = 1; i <= this.n; ++i) {
			sum += i;
		}

		return sum;
	}
		
	public static void main (String[] args) {
			
		System.out.println("Enter the number of elements: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		SumOfN s = new SumOfN(n);

		System.out.println(s.add() + "\n");
	}
}
