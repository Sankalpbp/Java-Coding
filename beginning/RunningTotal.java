import java.util.*;

public class RunningTotal {
		
	public int size;
	public int[] arr;

	public RunningTotal (int size) {
		this.size = size;
		this.arr = new int[size];

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < this.size; ++i) {
			this.arr[i] = input.nextInt();
		}
	}

	public int sum () {
		int aggregate = 0;
		for (int i = 0; i < this.size; ++i) {
			aggregate += this.arr[i];
		}

		return aggregate;
	}

	public static void main (String[] args) {
			
		System.out.println("Enter the size: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		
		RunningTotal rt = new RunningTotal (n);

		System.out.println(rt.sum());
	}
}
