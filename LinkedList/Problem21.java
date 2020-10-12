import java.util.*;
import java.io.*;

public class Problem21 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		int x = Integer.parseInt (l.input.readLine ());

		Node ptr = l.head;
		int count = 0;

		while (ptr != null) {
			if (ptr.data == x) {
				++count;
			}
			ptr = ptr.next;
		}

		System.out.println (count);
	}
}
