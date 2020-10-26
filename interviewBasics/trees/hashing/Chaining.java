import java.util.*;
import java.io.*;

public class Chaining {
		
	class Node {
		int data;
		Node next;

		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node [] arr;
	int size;

	public Chaining () {
		size = 10;
		arr = new Node [size];

		for (int i = 0; i < size; ++i) {
			arr[i] = null;
		}
	}

	public int getKey (int data) {
		return (data % size);
	}

	public void insert (int data) {
	
		int key = getKey (data);

		Node newNode = new Node (data);

		newNode.next = arr[key];
		arr[key] = newNode;
	}

	public void delete (int data) {
			
		int key = getKey (data);

		if (arr[key] == null) {
			System.out.println ("data not found");
			return;
		}

		if (arr[key].data == data) {
			arr[key] = arr[key].next;
		} else {
			Node ptr = arr[key];
			Node preptr = null;
			while (ptr.data != data) {
				preptr = ptr;
				ptr = ptr.next;
			}

			if (ptr == null) {
				System.out.println ("data not found");
				return;
			}

			preptr.next = ptr.next;
		}
	}

	public boolean search (int data) {
		
		int key = getKey (data);

		Node ptr = arr[key];

		while (ptr != null) {
			if (ptr.data == data) {
				return true;
			}

			ptr = ptr.next;
		}

		return false;
	}

	public static void main (String [] args) {
			
		Chaining chain = new Chaining ();

		chain.insert (1);
		chain.insert (2);
		chain.insert (3);
		chain.insert (4);
		chain.insert (5);
		chain.insert (6);

		if (chain.search (2)) {
			System.out.println ("yes");
		} else {
			System.out.println ("no");
		}

		chain.delete(2);

		if (chain.search (2)) {
			System.out.println ("yes");
		} else {
			System.out.println ("no");
		}
	}
}














