import java.util.*;
import java.io.*;

public class Problem18 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		Node ptr = l.head;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (ptr != null) {
			if (min > ptr.data) {
				min = ptr.data;
			} 

			if (max < ptr.data) {
				max = ptr.data;
			}
			ptr = ptr.next;
		}

		System.out.println (min + " " + max);
	}
}
