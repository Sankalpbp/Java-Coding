import java.util.*;

public class SmallestInArray {
		
	public static void main (String[] args) {
		
		List<Integer> array = new ArrayList<Integer> ();

		System.out.println("Enter the size of the array: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		for (int i = 0; i < n; ++i) {
			int x = input.nextInt();
			array.add(x);
		}

		int minimum = Integer.MAX_VALUE;

		for (Integer x : array) {
			minimum = (Math.min (minimum, x));
		}

		System.out.println(minimum);
	}
}
