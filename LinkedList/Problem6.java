import java.util.*;
import java.io.*;

public class Problem6 {
		
	public static void main (String [] args) throws IOException {
			
		CircularLinkedList cll = new CircularLinkedList ();
		cll.traverse ();
		Node copy = null;

		copy = new Node (cll.head.data);
		Node ptr = cll.head.next;
		Node pointer = copy;

		while (ptr != cll.head) {
			pointer.next = new Node (ptr.data);
			pointer = pointer.next;
			ptr = ptr.next;
		}

		pointer.next = copy;
		pointer = copy;
		System.out.print (pointer.data + " -> ");
		pointer = pointer.next;

		while (pointer != copy) {
			System.out.print (pointer.data + " -> ");
			pointer = pointer.next;
		}
		System.out.println ();
	}
}
