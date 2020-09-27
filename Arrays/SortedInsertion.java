import java.util.*;
import java.io.*;

public class SortedInsertion {
		
	public int size;
	public int[] arr;

	public SortedInsertion (int size) throws IOException {
		this.size = size;
		this.arr = new int[size];

		for (int i = 0; i < this.size; ++i) {
			this.arr[i] = Integer.MAX_VALUE;
		}
	}

	public void insertion (int index, int data) {
			
		System.out.println(index);
		for (int i = this.size - 1; i > index; --i) {
			this.arr[i] = this.arr[i - 1];
		}

		this.arr[index] = data;
	}

	public void insert (int x) {
			
		int index = 0;
		for (int i = 0; i < this.size; ++i) {
			if (this.arr[i] >= x) {
				index = i;
				break;
			}
		}

		insertion(index, x);
	}

	public void traverse () {
			
		for (int i = 0; i < this.size; ++i) {
			System.out.print (this.arr[i] + " ");
		}
		System.out.println();
	}

	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(input.readLine());

		SortedInsertion si = new SortedInsertion (n);

		System.out.println ("enter the numbers you want to insert");
		si.insert(1);
		si.insert(3);
		si.insert(2);
		si.insert(4);

		si.traverse ();
	}
}
