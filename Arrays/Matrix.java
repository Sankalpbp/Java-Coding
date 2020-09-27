import java.util.*;
import java.io.*;

public class Matrix {
		
	public int rows;
	public int cols;

	public int[][] matrix;

	public Matrix (int rows, int cols) throws IOException {
		this.rows = rows;
		this.cols = cols;

		this.matrix = new int[rows][cols];

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				this.matrix[i][j] = Integer.parseInt(input.readLine());
			}
		}
	}
}
