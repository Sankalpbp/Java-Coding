import java.util.*;

public class OddPosition {
		
	public int size;
	public int[] arr;

	public OddPosition (int size) {
		this.size = size;
		this.arr = new int[size];

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < this.size; ++i) {
			this.arr[i] = input.nextInt();
		}
	}

	public ArrayList<Integer> oddPositions () {
		ArrayList<Integer> array = new ArrayList<Integer> ();

		for (int i = 1; i < this.size; i += 2) {
			array.add(this.arr[i]);
		}

		return array;
	}

	public static void main (String[] args) {
			
		System.out.println("Enter the size of the array: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		OddPosition op = new OddPosition(n);
		
		ArrayList<Integer> array = op.oddPositions();

		for (int x : array) {
			System.out.print(x + " ");
		}
	}
}
