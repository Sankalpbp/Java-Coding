import java.util.*;
import java.io.*;

public class Problem23 {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();

		Node ptr = l.head;
		int sum = 0;
		int count = 0;

		while (ptr != null) {
			sum += ptr.data;
			ptr = ptr.next;
			++count;
		}

		System.out.println (sum);
		System.out.println ((float) sum / count);
	}
}
