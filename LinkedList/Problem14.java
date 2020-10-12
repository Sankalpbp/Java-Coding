import java.util.*;
import java.io.*;

public class Problem14 {

	public static void deleteFirst (LinkedList l, int x) {
			
		Node ptr = l.head;
		Node preptr = null;

		while (ptr != null && ptr.data != x) {
			preptr = ptr;
			ptr = ptr.next;
		}

		if (ptr == null) {
			return;
		}

		if (preptr == null) {
			l.head = l.head.next;
			return;
		}

		preptr.next = ptr.next;
		return;
	}

	public static void deleteLast (LinkedList l, int x) {

		Node ptr = l.head;
		Node toDelete = null;
		Node prevToDelete = null;
		Node preptr = null;

		while (ptr != null) {
			if (ptr.data == x) {
				prevToDelete = preptr;
				toDelete = ptr;
			}

			preptr = ptr;
			ptr = ptr.next;
		}

		if (toDelete == null) {
			return;
		}

		if (toDelete == l.head) {
			l.head = l.head.next;
			return;
		}

		if (toDelete != null) {
			prevToDelete.next = toDelete.next;
		}
	}

	public static void deleteAll (LinkedList l, int x) {
			
		Node ptr = l.head;
		Node preptr = null;

		while (ptr != null) {
			if (ptr.data == x) {
				if (ptr == l.head) {
					ptr = ptr.next;
					l.head = ptr;
				} else {
					preptr.next = ptr.next;
					ptr = preptr.next;
				}
			} else {
				preptr = ptr;
				ptr = ptr.next;
			}
		}

		return;
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		int x = Integer.parseInt (l.input.readLine ());

		deleteFirst (l, x);
		l.traverse ();
		deleteLast (l, x);
		l.traverse ();
		deleteAll (l, x);
		l.traverse ();
	}
}
