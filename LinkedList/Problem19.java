import java.util.*;
import java.io.*;

public class Problem19 {

	public static int size (LinkedList l) {
		Node ptr = l.head;

		int length = 0;
		while (ptr != null) {
			++length;
			ptr = ptr.next;
		}

		return length;
	}

	public static void interchange (LinkedList l) {
			
		int [] arr = new int [size(l)];

		Node ptr = l.head;
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = ptr.data;
			ptr = ptr.next;
		}
		
		for (int i = 0; i < arr.length / 2; ++i) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		ptr = l.head;

		for (int i = 0; i < arr.length; ++i) {
			ptr.data = arr[i];
			ptr = ptr.next;
		}
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();
		interchange (l);
		l.traverse ();
	}
}
