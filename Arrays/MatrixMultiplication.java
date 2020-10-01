import java.util.*;
import java.io.*;

public class MatrixMultiplication {
		
	public static void main (String[] args) throws IOException, Exception {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int rows1 = Integer.parseInt(input.readLine());
		int cols1 = Integer.parseInt(input.readLine());

		int[][] matrix1 = new int[rows1][cols1];

		for (int i = 0; i < rows1; ++i) {
			for (int j = 0; j < cols1; ++j) {
				matrix1[i][j] = Integer.parseInt(input.readLine());
			}
		}

		int rows2 = Integer.parseInt(input.readLine());
		int cols2 = Integer.parseInt(input.readLine());

		int [][] matrix2 = new int[rows2][cols2];
		
		for (int i = 0; i < rows2; ++i) {
			for (int j = 0; j < cols2; ++j) {
				matrix2[i][j] = Integer.parseInt(input.readLine());
			}
		}

		if (cols1 != rows2) {
			throw new Exception ("Matrices cannot be multiplied.");
		}

		int outputRows = rows1;
		int outputCols = cols2;
		int[][] output = new int[rows1][cols2];

		for (int i = 0; i < rows1; ++i) {
			for (int j = 0; j < cols2; ++j) {
				output[i][j] = 0;
				for (int k = 0; k < cols1; ++k) {
					output[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		for (int i = 0; i < rows1; ++i) {
			for (int j = 0; j < cols2; ++j) {
				System.out.print (output[i][j] + " ");
			}

			System.out.println();
		}
	}
}
