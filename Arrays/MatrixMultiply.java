import java.util.*;
import java.io.*;

public class MatrixMultiply {
		
	public Matrix matrix1;
	public Matrix matrix2;

	public MatrixMultiply () throws IOException {
		System.out.println ("Enter the rows and cols of the matrix 1: ");
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int rows1 = Integer.parseInt(input.readLine());
		int cols1 = Integer.parseInt(input.readLine());

		matrix1 = new Matrix(rows1, cols1);
		for (int i = 0; i < rows1; ++i) {
			for (int j = 0; j < cols1; ++j) {
				System.out.print (matrix1.matrix[i][j] + " ");
			}
			System.out.println ();
		}

		System.out.println ("Enter the rows and cols of the matrix 2: ");
		int rows2 = Integer.parseInt(input.readLine());
		int cols2 = Integer.parseInt(input.readLine());

		matrix2 = new Matrix (rows2, cols2);
	}

	public int[][] multiply () throws Exception {

		if (this.matrix1.rows != this.matrix2.cols) {
			throw new Exception ("Matrices cannot be multiplied due their dimensions.");
		}

		int outputRows = this.matrix1.rows;
		int outputCols = this.matrix2.cols;
		int[][] output = new int[outputRows][outputCols];

		for (int i = 0; i < outputRows; ++i) {
			for (int j = 0; j < outputCols; ++j) {
					
				output[i][j] = 0;
				for (int k = 0; k < outputRows; ++k) {
					output[i][j] += this.matrix1.matrix[i][k] * this.matrix2.matrix[k][j];
				}
				System.out.println();
			}
		}

		return output;
	}

	public static void main (String[] args) throws IOException{
		MatrixMultiply mm = new MatrixMultiply();	


		try {
			int[][] output = mm.multiply();
			for (int i = 0; i < output.length; ++i) {
				for (int j = 0; j < output[i].length; ++j) {
					System.out.print(output[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println (e);
		}
	}
}
