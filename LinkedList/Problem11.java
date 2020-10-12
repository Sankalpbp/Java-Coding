import java.util.*;
import java.io.*;

public class Problem11 {

	public static Node copyAlternate (LinkedList l) throws IOException {

		if (l.head == null) {
			return null;
		}

		Node newList = new Node (l.head.data);

		if (l.head.next == null) {
			return newList;	
		}

		Node pointer = newList;
		Node ptr = l.head.next.next;

		while (ptr != null && ptr.next != null) {
			pointer.next = new Node (ptr.data);
			ptr = ptr.next.next;
			pointer = pointer.next;
		}

		return newList;
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		Node result = copyAlternate (l);
		Node ptr = result;

		while (ptr != null) {
			System.out.print (ptr.data + " -> ");
			ptr = ptr.next;
		}
		System.out.println ();
	}
}
