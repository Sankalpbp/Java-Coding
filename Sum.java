import java.util.*;

public class Sum {
		
	public int size;
	public int[] arr;

	public Sum (int size) {
		this.size = size;
		this.arr = new int[size];

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < this.size; ++i) {
			this.arr[i] = input.nextInt();
		}
	}

	public int forSum() {
		int aggregate = 0;
		for (int i = 0; i < this.size; ++i) {
			aggregate += this.arr[i];
		}

		return aggregate;
	}

	public int whileSum () {
		int aggregate = 0;
		int i = 0;
		while (i < this.arr.length) {
			aggregate += this.arr[i];	
			++i;
		}

		return aggregate;
	}

	public int recursiveSum (int size) {
		if (size == 0) {
			return 0;
		}
		return recursiveSum(size - 1) + this.arr[size - 1];
	}

	public int recursiveSum () {
		return recursiveSum(this.size);
	}

	public static void main (String[] args) {
		
		System.out.println ("Enter the size of the array: ");
		Scanner input = new Scanner (System.in);

		int n = input.nextInt();
		Sum s = new Sum(n);

		System.out.println(s.forSum());
		System.out.println(s.whileSum());
		System.out.println(s.recursiveSum());
	}
}	

















