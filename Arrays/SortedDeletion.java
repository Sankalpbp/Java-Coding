import java.util.*;
import java.io.*;

public class SortedDeletion {
		
	public int size;
	public int[] arr;

	public SortedDeletion (int size) throws IOException {
		this.size = size;
		this.arr = new int[size];

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < this.size; ++i) {
			int x = Integer.parseInt(input.readLine());
			this.arr[i] = x;
		}
	}

	public void deletion (int index) {
		
		for (int i = index; i < this.size - 1; ++i) {
			this.arr[i] = this.arr[i + 1];
		}
	}

	public void traverse () {
		for (int i = 0; i < this.size; ++i) {
			System.out.print(this.arr[i] + " ");
		}

		System.out.println();
	}

	public void delete(int x) {
		int index = -1;

		for (int i = 0; i < this.size; ++i) {
			if (this.arr[i] == x) {
				index = i;
				break;
			}
		}

		deletion(index);
	}

	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(input.readLine());
		SortedDeletion sd = new SortedDeletion (n);

		System.out.println ("Enter the element you want to delete: ");
		int x = Integer.parseInt(input.readLine());
		sd.delete(x);

		sd.traverse();
	}
}
