import java.util.*;
import java.io.*;

public class ReadAndDisplay {
	public int [][] matrix;

	public ReadAndDisplay () throws IOException {
			
		this.matrix = new int[3][3];
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
				System.out.print (this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main (String[] args) throws IOException {
		
		ReadAndDisplay rd = new ReadAndDisplay();
		rd.traverse();
	}
}
