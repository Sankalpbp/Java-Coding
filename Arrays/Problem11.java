import java.util.*;
import java.io.*;

public class Problem11 {
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random ();

		int n = Integer.parseInt(input.readLine());
		int m = Integer.parseInt(input.readLine());

		int [][] matrix = new int[n][m];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				matrix[i][j] = random.nextInt(100);
			}
		}

		List<Integer> even = new ArrayList<Integer> ();
		List<Integer> odd = new ArrayList<Integer> ();

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (matrix[i][j] % 2 == 0) {
					even.add(matrix[i][j]);
				} else {
					odd.add(matrix[i][j]);
				}
			}
		}

		for (int x : even) {
			System.out.print(x + " ");
		}
		System.out.println();

		for (int x : odd) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
