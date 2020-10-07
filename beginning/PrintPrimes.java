import java.util.*;

public class PrintPrimes {
		
	public int range;

	public PrintPrimes (int range) {
		this.range = range;
	}

	public static boolean isPrime (int n) {
			
		if (n == 2) {
			return true;
		}

		for (int i = 2; i < n; ++i) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void work (int range) {
		
		System.out.println("0 is not a prime");
		System.out.println("1 is neither a prime nor a composite");
		
		for (int i = 2; i <= range; ++i) {
			if (isPrime (i) == true) {
				System.out.println(i);
			}
		}
	}

	public static void main (String [] args) {
			
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		PrintPrimes.work(n);
	}
}
