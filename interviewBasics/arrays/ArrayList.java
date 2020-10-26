import java.util.*;
import java.io.*;

public class ArrayList {
		
	int [] arr;
	int size = 0;
	int capacity = 0;

	public ArrayList () {
		arr = new int[1];
		capacity = 1;
	}

	public void pushBack (int data) {

		if (size == capacity) {
			// incresase the capacity
			capacity *= 2;

			// create a new bigger array
			int [] newArr = new int[2 * capacity];

			for (int i = 0; i < size; ++i) {
				newArr[i] = arr[i];
			}

			// set the new reference
			arr = newArr;
		}

		arr[size] = data;
		++size;
	}

	public void popBack () {
		--size;
	}

	public void print () {
		System.out.println ();
		for (int i = 0; i < size; ++i) {
			System.out.print (arr[i] + " ");	
		}
		System.out.println ();
	}

	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int n = Integer.parseInt(input.readLine ());
		ArrayList arlist = new ArrayList ();

		for (int i = 0; i < n; ++i) {
			arlist.pushBack(Integer.parseInt (input.readLine()));
		}

		arlist.print ();
	}
}
