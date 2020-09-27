import java.util.*;
import java.io.*;

public class SortedMerge {
		
	public int size1;
	public int size2;

	public int[] arr1;
	public int[] arr2;

	public SortedMerge (int size1, int size2) throws IOException {
		this.size1 = size1;
		this.size2 = size2;

		this.arr1 = new int[size1];
		this.arr2 = new int[size2];

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		System.out.println ("Enter the elements of the first array: ");
		for (int i = 0; i < this.size1; ++i) {
			this.arr1[i] = Integer.parseInt(input.readLine());
		}

		System.out.println ("Enter the elements of the second array: ");
		for (int i = 0; i < this.size2; ++i) {
			this.arr2[i] = Integer.parseInt(input.readLine());
		}
	}

	public List<Integer> merge () {
			
		List<Integer> list = new ArrayList<Integer> ();

		int i = 0, j = 0;

		while (i < this.size1 && j < this.size2) {
			if (this.arr1[i] > this.arr2[j]) {
				list.add(arr2[j]);
				++j;
			} else {
				list.add(arr1[i]);
				++i;
			}
		}

		while (i < this.size1) {
			list.add(this.arr1[i]);
			++i;
		}

		while (j < this.size2) {
			list.add(this.arr2[j]);
			++j;
		}

		return list;
	}

	public static void main (String[] args) throws IOException {

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n1 = Integer.parseInt(input.readLine());
		int n2 = Integer.parseInt(input.readLine());

		SortedMerge sm = new SortedMerge(n1, n2);

		List<Integer> list = sm.merge();
		for (Integer x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
