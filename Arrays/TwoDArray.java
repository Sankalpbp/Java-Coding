import java.util.*;
import java.io.*;

public class TwoDArray {
		
	public int rows;
	public int cols;

	public int[][] matrix;

	public TwoDArray (int rows, int cols) {
		this.rows = rows;
		this.cols = cols;

		this.matrix = new int[rows][cols];

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				this.matrix[i][j] = i + j;
			}
		}
	}

	public void traverse () {
			
		for (int i = 0; i < this.rows; ++i) {
			for (int j = 0; j < this.cols; ++j) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int rows = Integer.parseInt(input.readLine());
		int cols = Integer.parseInt(input.readLine());

		TwoDArray m = new TwoDArray(rows, cols);

		m.traverse();
	}
}
