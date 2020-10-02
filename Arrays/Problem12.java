import java.util.*;
import java.io.*;

public class Problem12 {
		
	public static void main (String [] args) throws IOException {
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random();

		int n = Integer.parseInt(input.readLine());

		float [] arr1 = new float [n];
		for (int i = 0; i < n; ++i) {
			arr1[i] = random.nextFloat();
			System.out.print (arr1[i] + " ");
		}

		System.out.println ();

		int m = Integer.parseInt(input.readLine());

		float [] arr2 = new float [m];
		for (int i = 0; i < m; ++i) {
			arr2[i] = random.nextFloat();
			System.out.print (arr2[i] + " ");
		}

		System.out.println ();

		List<Float> merged = new ArrayList<Float> ();

		int i = 0;
		int j = 0;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		while (i < n && j < m) {
			if (arr1[i] > arr2[j]) {
				merged.add(arr2[j]);
				++j;
			} else {
				merged.add(arr1[i]);
				++i;
			}
		}

		while (i < n) {
			merged.add(arr1[i]);
			++i;
		}

		while (j < m) {
			merged.add(arr2[j]);
			++j;
		}

		for (float x : merged) {
			System.out.print(x + " ");
		}

		System.out.println();
	}
}
