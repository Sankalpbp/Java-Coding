import java.util.*;
import java.io.*;

public class Problem4 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random ();

		int n = Integer.parseInt(input.readLine());

		int [] arr = new int[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = random.nextInt(100);
			System.out.print(arr[i] + " ");
		}

		int squaresSum = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] *= arr[i];
			squaresSum += arr[i];
		}

		System.out.println ("\n" + squaresSum);
	}
}
