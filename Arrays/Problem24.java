import java.util.*;
import java.io.*;

public class Problem24 {

	public static void delete (int [] arr, int i) {
		
		for (int j = i + 1; j < arr.length; ++j) {
			arr[j - 1] = arr[j];
		}
	}

	public static void deleteDuplicates (int [] arr) {
			
		int m = arr.length - 1;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] == arr[j]) {
					delete(arr, j);
					--j;
					break;
				}
			}
		}
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		int n = Integer.parseInt (input.readLine());
		int [] arr = new int[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = Integer.parseInt (input.readLine());
		}

		deleteDuplicates (arr);

		for (int i = 0; i < n; ++i) {
			System.out.print (arr[i] + " ");
		}

		System.out.println ();
	}
}
