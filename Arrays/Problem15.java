import java.util.*;
import java.io.*;

public class Problem15 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random ();

		int n = Integer.parseInt(input.readLine());

		int [][] matrix = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				matrix[i][j] = random.nextInt();
			}
		}

		int diagonalSum = 0;
		for (int i = 0; i < n; ++i) {
			diagonalSum += matrix[i][i];
			diagonalSum += matrix[i][n - i - 1];
		}

		if (n % 2 != 0) {
			diagonalSum -= matrix[n / 2][n / 2];
		}

		System.out.println(diagonalSum);
	}
}
