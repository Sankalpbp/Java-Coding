import java.util.*;
import java.io.*;

public class Problem1 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		for (Node ptr = l.head; ptr != null; ptr = ptr.next) {
			Node preptr = ptr;
			for (Node ptr2 = ptr.next; ptr2 != null; ptr2 = ptr2.next) {
				if (ptr2.data == ptr.data) {
					preptr.next = ptr2.next;
				} else {
					preptr = ptr2;
				}
			}
		}

		l.traverse ();
	}
}
