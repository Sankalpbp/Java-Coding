import java.util.*;
import java.io.*;

public class Problem20a {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		Node ptr = l.head;
		int data = ptr.data;

		// remove first node
		l.head = l.head.next;

		// find last node
		while (ptr.next != null) {
			ptr = ptr.next;
		}

		// add last node
		ptr.next = new Node (data);

		l.traverse ();
	}
}
