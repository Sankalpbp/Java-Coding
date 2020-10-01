import java.util.*;
import java.io.*;

public class MultidimensionalArray {
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int rows = Integer.parseInt(input.readLine());
		int cols = Integer.parseInt(input.readLine());
		int width = Integer.parseInt(input.readLine());

		int[][][] threeDim = new int[rows][cols][width];

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				for (int k = 0; k < width; ++k) {
					System.out.print (threeDim[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}
}
