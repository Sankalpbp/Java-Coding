import java.util.*;
import java.io.*;

public class Problem32 {

	public static int size (DNode head) {
		if (head == null) {
			return 0;
		}

		return 1 + size (head.next);
	}

	public static void move (DoublyLinkedList dll) {
		
		int length = size (dll.head);
		
		int count = 0;
		DNode ptr = dll.head;
		while (count < length / 2) {
			++count;
			ptr = ptr.next;
		}

		int data = ptr.data;
		ptr.previous.next = ptr.next;
		ptr.next.previous = ptr.previous;

		DNode newNode = new DNode (data);
		newNode.next = dll.head;
		dll.head.previous = newNode;
		dll.head = newNode;
	}
		
	public static void main (String [] args) throws IOException {
			
		DoublyLinkedList dll = new DoublyLinkedList ();

		move (dll);
		dll.traverse ();
	}
}
