import java.util.*;
import java.io.*;

public class Problem13 {
		
	public static void main (String [] args) throws IOException {
			
		DoublyLinkedList dll = new DoublyLinkedList ();

		int data = dll.head.data;

		dll.head = dll.head.next;	

		DNode ptr = dll.head;
		while (ptr.next != null) {
			ptr = ptr.next;
		}

		ptr.next = new DNode (data);

		dll.traverse ();
	}
}
