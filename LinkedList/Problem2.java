import java.util.*;
import java.io.*;

public class Problem2 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();
		int x = Integer.parseInt (l.input.readLine ());

		Node ptr = l.head;

		int occurences = 0;
		while (ptr != null) {
			if (ptr.data == x) {
				++occurences;
			}
			ptr = ptr.next;
		}

		System.out.println (occurences);
	}
}
