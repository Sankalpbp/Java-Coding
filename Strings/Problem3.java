import java.util.*;
import java.io.*;

public class Problem3 {
		
	public static String compare (String a, String b, int n) {
			
		if (n > a.length() || n > b.length()) {
			return "Not Possible";
		}

		for (int i = 0; i < n; ++i) {
			if (a.charAt(i) == b.charAt(i)) {
				continue;
			} else if (a.charAt(i) > b.charAt(i)) {
				return a + " is bigger.";
			} else {
				return b + " is bigger.";
			}
		}

		return "equal strings";
	}

	public static void main (String [] args) throws IOException {
			
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader input = new BufferedReader (isr);

		String a = input.readLine();
		String b = input.readLine();

		int n = Integer.parseInt(input.readLine());

		System.out.println (compare(a, b, n));

		input.close();
		isr.close();
	}
}
