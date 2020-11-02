import java.util.*;
import java.io.*;

public class HeapSort {

	public static void print (int [] arr) {
			
		System.out.println ();	
		for (int i = 0; i < arr.length; ++i) {
			System.out.print (arr[i] + " ");	
		}
		System.out.println ();	
	}

	public static void heapify (int [] arr, int size, int index) {
			
		int left = 2 * index + 1;
		int right = 2 * index + 2;

		int greatest = index;

		if (left < size && arr[left] > arr[greatest]) {
			greatest = left;
		}

		if (right < size && arr[right] > arr[greatest]) {
			greatest = right;
		}

		if (greatest != index) {
				
			//swap greatest and index
			int temp = arr[greatest];
			arr[greatest] = arr[index];
			arr[index] = temp;

			// heapify from greatest
			heapify (arr, size, greatest);
		}
	}

	public static void buildHeap (int [] arr) {
		
		int n = arr.length;
	
		for (int i = (n / 2); i >= 0; --i) {
			heapify (arr, n, i);
		}
	}

	public static void heapSort (int [] arr, int n) {

		buildHeap (arr);
			
		for (int i = n - 1; i > 0; --i) {
			// swap the first element and last element
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			// heapify till first i elements(ignoring the one swapped with first)
			heapify (arr, i, 0);
		}
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int n = Integer.parseInt (input.readLine ());
		int [] arr = new int[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = Integer.parseInt (input.readLine ());
		}

		print (arr);

		heapSort (arr, n);

		print (arr);
	}
}
