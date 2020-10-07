import java.util.*;

public class ReverseList {
		
	public int size;
	public int[] arr;

	public ReverseList (int size){
		this.size = size;
		arr = new int[size];

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < this.size; ++i) {
			arr[i] = input.nextInt();
		}
	}

	public void reverse () {
		for (int i = 0; i < (this.size / 2); ++i) {
			int temp = arr[i];
			arr[i] = arr[this.size - i - 1];
			arr[this.size - i - 1] = temp;
		}
	}

	public void print () {
			
		for (int i = 0; i < this.size; ++i) {
			System.out.print(this.arr[i] + " ");
		}
	}

	public static void main (String[] args) {
		
		System.out.println("Enter the size of the list: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		ReverseList rl = new ReverseList(n);
		rl.reverse();

		rl.print();
	}
}
