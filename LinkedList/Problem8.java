import java.util.*;
import java.io.*;

public class Problem8 {

	public static void sort (DoublyLinkedList dll) {
			
		for (DNode ptr1 = dll.head; ptr1 != null; ptr1 = ptr1.next) {
			for (DNode ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) {
				if (ptr1.data > ptr2.data) {
					int temp = ptr1.data;
					ptr1.data = ptr2.data;
					ptr2.data = temp;
				}
			}
		}

		return;
	}
		
	public static void main (String [] args) throws IOException {
			
		DoublyLinkedList dll = new DoublyLinkedList ();

		sort (dll);

		dll.traverse ();
	}
}
