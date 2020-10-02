import java.util.*;
import java.io.*;

public class Problem23 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int number = Integer.parseInt(input.readLine());

		int dummy = number;

		List<Integer> digits = new ArrayList<Integer> ();

		while (dummy > 0) {
			digits.add(dummy % 10);
			dummy /= 10;
		}

		for (int x : digits) {
			System.out.print (x + " ");
		}

		System.out.println ();
	}
}
