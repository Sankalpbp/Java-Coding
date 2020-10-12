import java.util.*;
import java.io.*;

public class Problem4 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		Node ptr = l.head;
		int count = 0;
		
		while (ptr != null) {
			if (ptr.data != 0) {
				++count;		
			}
			ptr = ptr.next;
		}

		System.out.println (count);
	}
}
