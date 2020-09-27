import java.util.*;
import java.io.*;

public class Number {
		
	public static void main (String[] args) throws IOException {
			
		List<Integer> list = new ArrayList<Integer> ();

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt (input.readLine());

		for (int i = 0; i < n; ++i) {
			int x = Integer.parseInt(input.readLine());
			list.add(x);
		}

		Collections.reverse(list);

		int number = 0;
		int tens = 1;
		for (int x : list) {
			number += tens * x;
			tens *= 10;
		}

		System.out.println (number);
	}
}
