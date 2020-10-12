import java.util.*;
import java.io.*;

public class Problem20 {
		
	public static void interchange (DoublyLinkedList dll) {
			
		if (dll.head == null || dll.head.next == null) {
			return;
		}

		DNode ptr = dll.head;
		DNode revPtr = ptr;
		while (revPtr.next != null) {
			revPtr = revPtr.next;
		}

		while (ptr != revPtr && revPtr.next != ptr) {
			int temp = ptr.data;
			ptr.data = revPtr.data;
			revPtr.data = temp;

			ptr = ptr.next;
			revPtr = revPtr.previous;
		}
	}

	public static void main (String [] args) throws IOException {
			
		DoublyLinkedList dll = new DoublyLinkedList ();

		interchange (dll);
		dll.traverse ();
	}
}
