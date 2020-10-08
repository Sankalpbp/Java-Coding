import java.util.*;
import java.io.*;

public class DoublyLinkedList {
		
	public DNode head = null;
	public BufferedReader input = null;

	public DoublyLinkedList () throws IOException {
		
		input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine ();
		DNode newNode = null;
		DNode ptr = null;
		int x = 0;

		while (s.equals("exit") == false) {
			x = Integer.parseInt (s);
			newNode = new DNode (x);

			if (head == null) {
				head = newNode;
				ptr = head;
			} else {
				newNode.previous = ptr;
				ptr.next = newNode;
				ptr = ptr.next;
			}

			s = input.readLine ();
		}
	}

	public void traverse () {
			
		if (head == null) {
			return;
		}

		DNode ptr = head;

		while (ptr != null) {
			System.out.print (ptr.data + " <-> ");
			ptr = ptr.next;
		}

		System.out.println ();
	}

	public void insertBeginning () throws IOException {
			
		int x = Integer.parseInt (input.readLine ());

		DNode newNode = new DNode (x);
		newNode.next = head;
		head.previous = newNode;
		head = newNode; 
	}

	public void insertEnd () throws IOException {
			
		int x = Integer.parseInt (input.readLine ());

		DNode newNode = new DNode (x);
		if (head == null) {
			head = newNode;
			return;
		}
		DNode ptr = head;

		while (ptr.next != null) {
			ptr = ptr.next;
		}

		ptr.next = newNode;
		newNode.previous = ptr;
	}

	public void insertBefore (int key) throws IOException {
			
		if (head == null) {
			System.out.println ("Data not found");
			return;
		}

		int x = Integer.parseInt (input.readLine ());
		DNode newNode = new DNode (x);

		DNode ptr = head;

		while (ptr != null && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr == null) {
			return;
		}

		DNode preptr = ptr.previous;
		if (preptr == null) {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
			return;
		}

		preptr.next = newNode;
		newNode.previous = preptr;
		newNode.next = ptr;
		ptr.previous = newNode;
	}

	public void insertAfter (int key) throws IOException {
			
		if (head == null) {
			return;
		}

		int x = Integer.parseInt (input.readLine ());
		DNode newNode = new DNode (x);
		DNode ptr = head;

		while (ptr != null && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr == null) {
			System.out.println ("Data not found");
			return;
		}

		newNode.next = ptr.next;
		if (ptr.next != null) {
			ptr.next.previous = newNode;
		}
		ptr.next = newNode;
		newNode.previous = ptr;
	}

	public void deleteBeginning () {
			
		if (head == null) {
			return;
		}

		head = head.next;
		head.previous = null;
	}

	public void deleteEnd () {
		
		if (head == null) {
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}
		DNode ptr = head;

		while (ptr.next != null) {
			ptr = ptr.next;
		}

		ptr.previous.next = null;
	}

	public void deleteAfter (int key) {
			
		if (head == null) {
			return;
		}

		DNode ptr = head;

		while (ptr != null && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr == null || ptr.next == null) {
			System.out.println ("Data not found");
			return;
		}

		ptr.next = ptr.next.next;
		ptr.next.previous = ptr;
	}

	public void deleteBefore (int key) {
		
		if (head == null) {
			return;
		}

		DNode ptr = head;
		while (ptr != null && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr == null) {
			return;
		}

		if (ptr.previous == null) {
			return;
		}

		if (ptr.previous.previous == null) {
			head = head.next;
			head.previous = null;
		}

		DNode preptr = ptr.previous.previous;
		preptr.next = ptr;
		ptr.previous = preptr;
	}

	public void deleteList () {
			
		DNode ptr = head;
		while (ptr.next != null) {
			deleteEnd ();
		}

		deleteEnd ();
	}
}

































