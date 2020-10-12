import java.util.*;
import java.io.*;

public class Problem36 {

	public static boolean isSorted (LinkedList l) {
			
		int value = Integer.MIN_VALUE;
		Node ptr = l.head;

		while (ptr != null) {
			if (value > ptr.data) {
				return false;
			}
			value = ptr.data;
			ptr = ptr.next;
		}

		return true;
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();
		System.out.println (isSorted (l));
	}
}
