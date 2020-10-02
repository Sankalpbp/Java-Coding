import java.util.*;
import java.io.*;

public class Problem10 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random ();

		int n = Integer.parseInt(input.readLine());
		int m = Integer.parseInt(input.readLine());

		int [][] matrix = new int [n][m];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				matrix[i][j] = random.nextInt();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int count = 0;

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (matrix[i][j] != 0) {
					++count;
				}
			}
		}

		System.out.println (count);
	}
}
