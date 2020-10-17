import java.util.*;
import java.io.*;

public class LinkedStack {
		
	private Node topp;
	private int length = 0;
	
	public LinkedStack () {
		topp = null;
		length = 0;
	}

	public int top () throws Exception {
		
		if (topp == null) {
			throw new Exception ("Stack overflow");
		}

		return topp.data;
	}

	public void push (int x) {
		Node newNode = new Node (x);
		newNode.next = topp;
		topp = newNode;

		length += 1;
	}

	public void pop () throws Exception {
		if (topp == null) {
			throw new Exception ("Stack overflow");
		}

		topp = topp.next;
		length -= 1;
	}

	public int size () {
		return length;				
	}
}
