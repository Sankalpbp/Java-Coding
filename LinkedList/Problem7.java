import java.util.*;
import java.io.*;

public class Problem7 {

	public static Node merge (LinkedList l1, LinkedList l2) throws IOException {
			
		Node merged = new Node (-1);
		Node ptr = merged;
		Node ptr1 = l1.head;
		Node ptr2 = l2.head;

		while (ptr1 != null && ptr2 != null) {
			if (ptr1.data > ptr2.data) {
				ptr.next = ptr2;
				ptr = ptr.next;
				ptr2 = ptr2.next;
			} else {
				ptr.next = ptr1;
				ptr = ptr.next;
				ptr1 = ptr1.next;
			}
		}

		while (ptr1 != null) {
			ptr.next = ptr1;
			ptr1 = ptr1.next;
			ptr = ptr.next;
		}
		
		while (ptr2 != null) {
			ptr.next = ptr2;
			ptr2 = ptr2.next;
			ptr = ptr.next;
		}

		return merged.next;
	}
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l1 = new LinkedList ();
		LinkedList l2 = new LinkedList ();

		Node merged = merge (l1, l2);

		while (merged != null) {
			System.out.print (merged.data + " -> ");
			merged = merged.next;
		}
		System.out.println ();
	}
}
