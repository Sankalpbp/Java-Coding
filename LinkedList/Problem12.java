import java.util.*;
import java.io.*;

public class Problem12 {

	public static DoublyLinkedList concatenate (DoublyLinkedList d1, DoublyLinkedList d2) {
			
		if (d1 == null) {
			return d2;
		} else if (d2 == null) {
			return d1;
		}

		DNode ptr = d1.head;
		while (ptr.next != null) {
			ptr = ptr.next;	
		}

		ptr.next = d2.head;

		return d1;
	}
		
	public static void main (String [] args) throws IOException {
		
		DoublyLinkedList d1 = new DoublyLinkedList ();
		DoublyLinkedList d2 = new DoublyLinkedList ();

		DoublyLinkedList d3 = concatenate (d1, d2);

		d3.traverse ();
	}
}
