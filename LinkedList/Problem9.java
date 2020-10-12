import java.util.*;
import java.io.*;

public class Problem9 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l1 = new LinkedList ();
		LinkedList l2 = new LinkedList ();

		LinkedList result = new LinkedList ();

		Node ptr = l1.head;

		while (ptr.next != null) {
			ptr = ptr.next;
		}

		ptr.next = l2.head;

		l1.traverse ();
	}
}
