import java.util.*;

public class Mean {
		
	public int size;
	public int[] arr;

	public Mean (int size) {
		this.size = size;
		this.arr = new int[size];

		Scanner input = new Scanner (System.in);
		for (int i = 0; i < size; ++i) {
			this.arr[i] = input.nextInt();
		}
	}

	public double spitMean () {
		int sum = 0;
		double mean = 0;

		for (int i = 0; i < this.size; ++i) {
			sum += this.arr[i];
		}

		mean = sum / this.size;
		return mean;
	}

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		Mean m = new Mean (n);
		System.out.println(m.spitMean());
	}
}
