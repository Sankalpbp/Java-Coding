import java.util.*;
import java.io.*;

public class Problem15 {

	public static Node reverse (Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node reverseSmall = reverse (head.next);
		head.next.next = head;
		head.next = null;

		return reverseSmall;
	}

	public static void reverse (LinkedList l) {
		l.head = reverse (l.head);
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();
		reverse (l);
		l.traverse ();
	}
}
