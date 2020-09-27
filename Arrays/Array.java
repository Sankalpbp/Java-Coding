import java.util.*;

public class Array {
		
	public int capacity;
	public int[] arr;

	public Array (int capacity) {
		this.capacity = capacity;
		this.arr = new int[this.capacity];

		for (int i = 0; i < this.capacity; ++i) {
			this.arr[i] = -1;
		}
	}

	public void insertion (int index, int data) {
		
		if (this.arr[index] == -1) {
			this.arr[index] = data;
		} else {
			if (index == this.capacity - 1) {
				this.arr[index] = data;	
			} else if (index >= this.capacity) {
				System.out.println("Insertion not possible");
				return;
			} else {
				// we need to shift the other elements and make space
				for (int i = this.capacity - 1; i > index; --i) {
					this.arr[i] = this.arr[i - 1];
				}

				this.arr[index] = data;
			}
		}
	}

	public void deletion (int index) {

		for (int i = index; i < this.capacity - 1; ++i) {
			this.arr[i] = this.arr[i + 1];
		}

		this.arr[this.capacity - 1] = -1;
	}

	public void updation (int index, int data) {
		if (index < this.capacity) {
			this.arr[index] = data;
		}
	}

	public void traversal () {
		for (int i = 0; i < this.capacity; ++i) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println ();
	}

	public static void main (String[] args) {
		System.out.println ("Enter the capacity of the array: ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();

		Array a = new Array(n);
		a.insertion(0, 1);
		a.insertion(1, 2);
		a.insertion(2, 3);

		a.traversal();

		a.deletion(1);

		a.traversal();
	}
}
