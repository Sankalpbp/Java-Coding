import java.util.*;
import java.io.*;

public class Problem9 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random();

		int n = Integer.parseInt(input.readLine());

		int [][] matrix = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				matrix[i][j] = random.nextInt(50);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		int product = 1;

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < (n - i - 1); ++j) {
				product *= matrix[i][j];
			}
		}

		System.out.println(product);
	}
}
