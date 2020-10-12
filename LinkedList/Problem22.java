import java.util.*;
import java.io.*;

public class Problem22 {
		
	public static void main (String [] args) throws IOException {
			
		DoublyLinkedList dll = new DoublyLinkedList ();

		DNode ptr = dll.head;
		while (ptr != null) {
			ptr.data += 10;
			ptr = ptr.next;
		}

		dll.traverse ();
	}
}
