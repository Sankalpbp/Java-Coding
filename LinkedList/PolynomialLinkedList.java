import java.util.*;
import java.io.*;

public class PolynomialLinkedList {
		
	public PolyNode head = null;
	public BufferedReader input = null;

	public PolynomialLinkedList () throws IOException {
			
		input = new BufferedReader (new InputStreamReader (System.in));
		int power = 0;
		int coefficient = 0;

		String s = input.readLine ();
		PolyNode newNode = null;
		PolyNode ptr = null;

		while (s.equals("exit") == false) {
			
			power = Integer.parseInt (s);
			coefficient = Integer.parseInt (input.readLine ());

			newNode = new PolyNode (power, coefficient);

			if (head == null) {
				head = newNode;
				ptr = head;
			} else {
				ptr.next = newNode;
				ptr = ptr.next;
			}

			s = input.readLine ();
		}
	}

	public void traverse () {
			
		PolyNode ptr = head;
		while (ptr != null) {
			if (ptr.coefficient != 1) {
				System.out.print (ptr.coefficient);
			}
			System.out.print ("x^" + ptr.power + " + ");
			ptr = ptr.next;
		}

		System.out.println ();
	}

	public PolyNode add (PolynomialLinkedList other) {
			
		PolyNode ptr = new PolyNode (-1000, -1000);
		PolyNode dummy = ptr;
		PolyNode newNode = null;

		PolyNode ptr1 = this.head;
		PolyNode ptr2 = other.head;

		while (ptr1 != null && ptr2 != null) {

			newNode = new PolyNode ();
			if (ptr1.power == ptr2.power) {
				newNode.power = ptr1.power;
				newNode.coefficient = ptr1.coefficient + ptr2.coefficient;
				ptr.next = newNode;
				ptr = ptr.next;
				
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			} else if (ptr1.power > ptr2.power) {
				newNode.power = ptr1.power;
				newNode.coefficient = ptr1.coefficient;
				ptr.next = newNode;
				ptr = ptr.next;

				ptr1 = ptr1.next;
			} else {
				newNode.power = ptr2.power;
				newNode.coefficient = ptr2.coefficient;
				ptr.next = newNode;
				ptr = ptr.next;

				ptr2 = ptr2.next;
			}
		}

		while (ptr1 != null) {
			newNode = new PolyNode ();
			newNode.power = ptr1.power;
			newNode.coefficient = ptr1.coefficient;
			ptr.next = newNode;
			ptr = ptr.next;

			ptr1 = ptr1.next;
		}

		while (ptr2 != null) {
			newNode = new PolyNode ();
			newNode.power = ptr2.power;
			newNode.coefficient = ptr2.coefficient;
			ptr.next = newNode;
			ptr = ptr.next;

			ptr2 = ptr2.next;
		}

		return dummy.next;
	}
}































