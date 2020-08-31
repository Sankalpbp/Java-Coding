import java.util.*;

public class LinearSearch {
		
	public int size;
	public int[] arr;

	public LinearSearch (int size) {
		this.size = size;

		this.arr = new int[size];

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < this.size; ++i) {
			this.arr[i] = input.nextInt();
		}
	}

	public int find (int key) {
		
		for (int i = 0; i < this.size; ++i) {
			if (this.arr[i] == key) {
				return i;
			}
		}

		return -1;
	}

	public static void main (String [] args) {
		
		System.out.println("Enter the size of the array: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		LinearSearch ls = new LinearSearch (n);

		System.out.println("Enter the element you want to find: ");
		int key = input.nextInt();
		System.out.println(ls.find(key));
	}
}
