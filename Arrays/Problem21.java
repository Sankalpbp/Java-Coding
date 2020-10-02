import java.util.*;
import java.io.*;


public class Problem21 {

	public static int [][]  add (int [][] matrix1, int x, int [][] matrix2, int y) {
			
		int n = matrix1.length;
		int m = matrix1[0].length;

		int [][] output = new int [matrix1.length][matrix1[0].length];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				output[i][j] = x * matrix1[i][j] + y * matrix2[i][j];
			}
		}

		return output;
	}
		
	public static void main (String [] args) throws IOException {
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int x = Integer.parseInt (input.readLine());
		int y = Integer.parseInt (input.readLine());

		int n = Integer.parseInt (input.readLine());
		int m = Integer.parseInt (input.readLine());

		int [][] matrix1 = new int [n][m];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				matrix1[i][j] = 1;
			}
		}

		int [][] matrix2 = new int [n][m];
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				matrix2[i][j] = 1;
			}
		}

		int [][] output = add(matrix1, x, matrix2, y);

		for (int i = 0; i < output.length; ++i) {
			for (int j = 0; j < output[i].length; ++j) {
				System.out.print(output[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n");
	}
}
