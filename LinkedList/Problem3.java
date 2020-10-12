import java.util.*;
import java.io.*;

public class Problem3 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		Node ptr = l.head;
		while (ptr != null) {
			ptr.data *= 10;
			ptr = ptr.next;
		}

		ptr = l.head;
		while (ptr != null) {
			System.out.print (ptr.data + " ");
			ptr = ptr.next;
		}

		System.out.println ();
	}
}
