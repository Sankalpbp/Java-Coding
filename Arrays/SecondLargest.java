import java.util.*;
import java.io.*;

public class SecondLargest {
		
	public static void main (String [] args) throws IOException {
			
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		List<Integer> list = new ArrayList<Integer> ();

		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());

		for (int i = 0; i < n; ++i) {
			int x = Integer.parseInt(input.readLine());
			list.add(x);
		}

		for (int x : list) {
			if (max < x) {
				secondMax = max;
				max = x;
			} else if (secondMax < x) {
				secondMax = x;
			}
		}

		System.out.println(max);
		System.out.println(secondMax);
	}
}
