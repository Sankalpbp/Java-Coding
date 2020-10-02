import java.util.*;
import java.io.*;

public class Problem3 {

	public static void swapTheOnes (int [] arr) {
			
		int n = arr.length;
		int temp = arr[1];
		arr[1] = arr[n - 2];
		arr[n - 2] = temp;
	}
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random();

		int size = Integer.parseInt(input.readLine());
		int [] arr = new int [size];

		for (int i = 0; i < size; ++i) {
			arr[i] = random.nextInt(100);
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}

		swapTheOnes(arr);
		System.out.println();

		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
	}
}
