import java.util.*;
import java.io.*;

public class SortStrings {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int n = Integer.parseInt(input.readLine());
		String [] arr = new String [n];

		for (int i = 0; i < n; ++i) {
			arr[i] = input.readLine();
		}

		Arrays.sort(arr);

		for (int i = 0; i < n; ++i) {
			System.out.println (arr[i]);
		}

		System.out.println("\n\n");
	}
}
