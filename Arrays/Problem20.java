import java.util.*;
import java.io.*;

public class Problem20 {

	public static boolean isSymmetric (int [][] matrix) {
			
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}

		return true;
	}
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random();

		int n = Integer.parseInt(input.readLine());
		int [][] matrix = new int [n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				matrix[i][j] = random.nextInt(100);
			}
		}

		if (isSymmetric (matrix)) {
			System.out.println ("Yes, symmetric.");
		} else {
			System.out.println ("No, not symmetric.");
		}
	}
}
