import java.util.*;
import java.io.*;

public class MatrixSum {
		
	public Matrix matrix1;
	public Matrix matrix2;
	
	public MatrixSum () throws IOException {
		System.out.println("Enter the rows and cols of the matrices: ");

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int rows = Integer.parseInt(input.readLine());
		int cols = Integer.parseInt(input.readLine());

		this.matrix1 = new Matrix(rows, cols);
		this.matrix2 = new Matrix(rows, cols);
	}

	public int[][] sumUp() throws IOException {
			
		int[][] answer = new int[matrix1.rows][matrix2.cols];

		for (int i = 0; i < matrix1.rows; ++i) {
			for (int j = 0; j < matrix1.cols; ++j) {
				answer[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
			}
		}

		return answer;
	}

	public static void main (String[] args) throws IOException {
		
		MatrixSum ms = new MatrixSum();
		int[][] answer = ms.sumUp();

		for (int i = 0; i < answer.length; ++i) {
			for (int j = 0; j < answer[0].length; ++j) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}
}
