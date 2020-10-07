import java.util.*;

public class MaximumElement {
		
	public int size;
	public int[] arr;

	public MaximumElement(int size) {
		this.size = size;

		arr = new int[size];

		Scanner input = new Scanner (System.in);
		for (int i = 0; i < this.size; ++i) {
			arr[i] = input.nextInt();
		}
	}

	public int maximum () {
			
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < this.size; ++i) {
			if (max < this.arr[i]) {
				max = this.arr[i];
			}
		}

		return max;
	}

	public static void main (String[] args) {
			
		System.out.println("Enter the size of the array: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		MaximumElement m = new MaximumElement(n);
		
		System.out.println(m.maximum());
	}
}
