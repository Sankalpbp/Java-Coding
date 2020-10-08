import java.util.*;
import java.io.*;

public class CircularLinkedList {
		
	public Node head = null;
	BufferedReader input = null;

	public CircularLinkedList () throws IOException {

		this.input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();
		Node ptr = null;
		Node newNode = null;
		int x = 0;

		while (s.equals("exit") == false) {
			x = Integer.parseInt(s);
			newNode = new Node (x);

			if (head == null) {
				head = newNode;
				ptr = head;
				head.next = head;
			} else {
				ptr.next = newNode;
				ptr = ptr.next;
			}

			s = input.readLine();
		}

		ptr.next = head;
	}

	public void traverse () {
			
		if (head == null) {
			return;
		}
		Node ptr = head;

		System.out.print (ptr.data + " ->  ");
		ptr = ptr.next;
		while (ptr != head) {
			System.out.print (ptr.data + " ->  ");
			ptr = ptr.next;
		}
		System.out.println ();
	}

	public void insertBeginning () throws IOException {
		
		int x = Integer.parseInt (input.readLine ());
		Node newNode = new Node (x);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}

		Node ptr = head;

		while (ptr.next != head) {
			ptr = ptr.next;
		}

		newNode.next = head;
		head = newNode;
		ptr.next = head;
	}

	public void insertEnd () throws IOException {

		int x = Integer.parseInt (input.readLine ());
		Node newNode = new Node (x);

		if (head == null) {
			head = newNode;
			return;
		}

		Node ptr = head;

		while (ptr.next != head) {
			ptr = ptr.next;
		}

		ptr.next = newNode;
		newNode.next = head;
	}

	public void deleteBeginning () {
			
		// if there is no element
		if (head == null) {
			return;
		}

		// if there is one element
		if (head.next == head) {
			System.out.println ("No element found");
			return;
		}

		// if there are more than one elments
		Node ptr = head;
		while (ptr.next != head) {
			ptr = ptr.next;
		}

		head = head.next;
		ptr.next = head;
	}

	public void deleteEnd () {
			
		// if there is no element 
		if (head == null) {
			return;
		}

		// if there is one element
		if (head.next == head) {
			this.deleteBeginning ();
			return;
		}

		// if there are more than one elements
		Node ptr = head;
		Node preptr = null;
		while (ptr.next != head) {
			preptr = ptr;
			ptr = ptr.next;
		}

		// as preptr is the second last node reference, therefore, we can safely do this...
		preptr.next = head;
	}

	public void insertAfter (int key) throws IOException {
			
		int x = Integer.parseInt (input.readLine ());
		Node newNode = new Node (x);

		// if there are no nodes
		if (head == null) {
			return;
		} 

		// if head has the key
		if (head.data == key) {
			newNode.next = head.next;
			head.next = newNode;
			return;
		}

		Node ptr = head;
		while (ptr.next != head && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr.data == key) {
			if (ptr.next == head) {
				ptr.next = newNode;
				newNode.next = head;
			} else {
				newNode.next = ptr.next;
				ptr.next = newNode;
			}
	 	}
	}

	public void insertBefore (int key) throws IOException {
			
		int x = Integer.parseInt (input.readLine ());
		Node newNode = new Node (x);

		if (head == null) {
			return;
		}

		Node ptr = head;
		Node preptr = null;


		if (head.data == key) {

			while (ptr.next != head) {
				preptr = ptr;
				ptr = ptr.next;
			}

			newNode.next = head;
			head = newNode;
			ptr.next = newNode;
			return;
		} 

		ptr = head.next;
		preptr = head;
		while (ptr != head && ptr.data != key) {
			preptr = ptr;
			ptr = ptr.next;
		}

		newNode.next = ptr;
		preptr.next = newNode;
	}

	public void deleteBefore (int key) {
			
		if (head == null) {
			return;
		}

		if (head.data == key) {
			System.out.println ("No data available");
			return;
		}

		Node ptr = head;
		Node preptr = null;

		while (ptr.next != head && ptr.next.data != key) {
			preptr = ptr;
			ptr = ptr.next;
		}

		if (head.next.data == key) {
			head = head.next;
			return;
		}

		if (ptr.next == head && ptr.data != key) {
			System.out.println ("No data available");
			return;
		}

		preptr.next = ptr.next;
	}

	public void deleteAfter (int key) {
			
		if (head == null || head.next == head) {
			return;
		}

		if (head.data == key) {
			head.next = head.next.next;
			return;
		}

		Node ptr = head;
		while (ptr.next != head && ptr.data != key) {
			ptr = ptr.next;
		}

		if (ptr.data != key) {
			return;
		}

		ptr.next = ptr.next.next;
	}

	public void deleteList () {
		Node ptr = head;

		while (ptr.next != head) {
			deleteEnd ();
		}

		head = null;
	}
}





















