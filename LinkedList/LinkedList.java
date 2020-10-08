import java.util.*;
import java.io.*;

public class LinkedList {
		
	public Node head = null;
	BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

	public LinkedList () throws IOException {
			
		int x = 0;
		Node ptr = null;

		do {
			x = Integer.parseInt(input.readLine());
			Node newNode = new Node (x);
			if (head == null) {
				head = newNode;
				ptr = head;
			} else {
				ptr.next = newNode;
				ptr = ptr.next;
			}
		} while (x != -1);
	}

	public void traverse () {
		Node ptr = head;

		while (ptr != null) {
			System.out.print (ptr.data + " -> ");
			ptr = ptr.next;
		}

		System.out.println ();
	}

	public void insertBeginning () throws IOException {
		int x = Integer.parseInt(input.readLine());
		Node newNode = new Node (x);
		newNode.next = head;
		head = newNode;
	}

	public void insertEnd () throws IOException {
		int x = Integer.parseInt(input.readLine());
		Node newNode = new Node (x);
		if (head == null) {
			head = newNode;
			return;
		}
		Node ptr = head;

		while (ptr.next != null) {
			ptr = ptr.next;
		}

		ptr.next = newNode;
	}

	public void insertBefore (int key) throws IOException {
		int x = Integer.parseInt(input.readLine());
		Node newNode = new Node (x);

		if (head == null) {
			head = newNode;
			return;
		}

		Node ptr = head;
		Node preptr = null;

		while (ptr != null && ptr.data != key) {
			preptr = ptr;
			ptr = ptr.next;
		}

		if (ptr == null) {
			System.out.println ("Given key not found");
			return;
		}
		if (preptr == null) {
			newNode.next = head;
			head = newNode;
		} else {
			preptr.next = newNode;
			newNode.next = ptr;
		}
	}

	public void insertAfter (int key) throws IOException {
			
		int x = Integer.parseInt (input.readLine());
		Node newNode = new Node (x);

		if (head == null) {
			head = newNode;
			return;
		}

		Node ptr = head;
		while (ptr != null && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr != null) {
			newNode.next = ptr.next;
			ptr.next = newNode;
		} else {
			System.out.println ("Given key not found");
			return;
		}
	}

	public void deleteBeginning () {
		head = head.next;
	}

	public void deleteEnd() {
			
		if (head == null || head.next == null) {
			head = null;
			return;
		}

		Node ptr = head;
		while (ptr.next.next != null) {
			ptr = ptr.next;
		}

		ptr.next = ptr.next.next;
	}

	public void deleteAfter (int key) {
		if (head == null) {
			return;
		}

		Node ptr = head;
		while (ptr != null && ptr.data != key) {
			ptr = ptr.next;			
		}

		if (ptr == null) {
			System.out.println ("Given key not found");
			return;
		}

		if (ptr.next == null) {
			return;
		}
		ptr.next = ptr.next.next;
	}

	public void deleteBefore (int key) {
		if (head == null) {
			return;
		}

		Node ptr = head;
		Node preptr = null;
		while (ptr.next != null && ptr.next.data != key) {
			preptr = ptr;
			ptr = ptr.next;
		}

		if (preptr == null) {
			return;
		} else if (ptr.next == null) {
			System.out.println ("Given key not found");
			return;
		}

		preptr.next = ptr.next;
	}

	public void deleteList () {
		while (head != null) {
			head = head.next;
		}
	}

	public void sort () {
		
		for (Node ptr1 = head; ptr1 != null; ptr1 = ptr1.next) {
			for (Node ptr2 = head; ptr2.next != null; ptr2 = ptr2.next) {
				if (ptr2.data > ptr2.next.data) {
					int temp = ptr2.data;
					ptr2.data = ptr2.next.data;
					ptr2.next.data = temp;
				}
			}
		}
	}
}



















