import java.util.*;
import java.io.*;

public class Problem24 {

	public static void deleteKth (LinkedList l, int k) {
			
		Node ptr = l.head;
		Node preptr = null;
		int count = 1;

		while (ptr != null && count < k) {
			++count;
			preptr = ptr;
			ptr = ptr.next;
		}

		if (preptr == null) {
			l.head = l.head.next;
		}

		if (ptr == null) {
			return;
		}

		preptr.next = ptr.next;
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		int k = Integer.parseInt (l.input.readLine ());
		deleteKth (l, k);
		l.traverse ();
	}
}
