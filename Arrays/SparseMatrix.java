import java.util.*;
import java.io.*;

public class SparseMatrix {
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		List<Sparse> sparseData = new ArrayList<Sparse> ();

		int rows = Integer.parseInt(input.readLine());
		int cols = Integer.parseInt(input.readLine());

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				int data = Integer.parseInt(input.readLine());
				if (data != 0) {
					Sparse object = new Sparse(i, j, data);
					sparseData.add(object);
				}
			}
		}

		for (Sparse x : sparseData) {
			System.out.println (x.row + " " + x.col + " " + x.data);
		}
	}
}
