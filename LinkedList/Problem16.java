import java.util.*;
import java.io.*;

public class Problem16 {

	public static Node number (int n) {
			
		Node head = new Node (-1);
		Node dummy = head;

		while (n > 0) {
			head.next = new Node (n % 10);
			n /= 10;
			head = head.next;
		}

		return dummy.next;
	}

	public static Node reverse (Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node small = reverse (head.next);
		head.next.next = head;
		head.next = null;

		return small;
	}

	public static void print (Node head) {
		if (head == null) {
			return;
		}

		System.out.print (head.data + " -> ");
		print (head.next);
	}
		
	public static void main (String [] args) {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));	

		int n = 0;
		try {
			n = Integer.parseInt (input.readLine ());
		} catch (IOException e) {
			System.out.println (e);
		}

		Node head = number (n);
		head = reverse (head);

		print (head);
		System.out.println ();
	}
}
