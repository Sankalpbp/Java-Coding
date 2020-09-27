import java.util.*;
import java.io.*;

public class Transpose {
		
	public int [][] matrix;

	public Transpose () throws IOException {
			
		matrix = new int[3][3];
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				this.matrix[i][j] = Integer.parseInt(input.readLine());
			}
		}
	}

	public void traverse () {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] transpose () throws IOException {
		
		int[][] newMatrix = new int[3][3];
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3 ; ++j) {
				newMatrix[i][j] = this.matrix[j][i];
			}
		}

		return newMatrix;
	}

	public static void main (String[] args) throws IOException {
			
		Transpose t = new Transpose ();
		int[][] answer = t.transpose ();

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}
}
