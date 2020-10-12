import java.util.*;
import java.io.*;

public class Problem5 {

	public static boolean isSorted (LinkedList l) {
			
		int value = Integer.MIN_VALUE;
		Node ptr = l.head;

		while (ptr != null) {
			if (ptr.data < value) {
				return false;
			} else {
				value = ptr.data;
				ptr = ptr.next;
			}
		}

		return true;
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		System.out.println (isSorted(l));
	}
}
