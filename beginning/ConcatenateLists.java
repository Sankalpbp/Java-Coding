import java.util.*;

public class ConcatenateLists {
		
	public int size;
	public int[] arr;

	public ConcatenateLists(int size) {
		this.size = size;
		this.arr = new int[size];
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < this.size; ++i) {
			this.arr[i] = input.nextInt();
		}
	}

	public static ArrayList<Integer> concatenate (ConcatenateLists arr1, ConcatenateLists arr2) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();

		int ri = 0;
		for (int i = 0; i < arr1.size; ++i) {
			result.add(arr1.arr[i]);
		}

		for (int i = 0; i < arr2.size; ++i) {
			result.add(arr2.arr[i]);
		}

		return result;
	}

	public static void main (String[] args) {
			
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of array 1: ");
		int n1 = input.nextInt();
		System.out.println("Enter the size of array 2: ");
		int n2 = input.nextInt();

		ConcatenateLists c1 = new ConcatenateLists(n1);
		ConcatenateLists c2 = new ConcatenateLists(n2);

		ArrayList<Integer> output = concatenate(c1, c2);

		for (int x : output) {
			System.out.println(x);
		}
	}
}
