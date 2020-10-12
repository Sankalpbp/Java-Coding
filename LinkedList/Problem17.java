import java.util.*;
import java.io.*;

public class Problem17 {
		
	public static void main (String [] args) {
			
		LinkedList l = null;

		try {
			l = new LinkedList ();
		} catch (IOException e) {
			System.out.println (e);	
		}

		Node ptr = l.head;
		int sum = 0;
		while (ptr != null) {
			sum += ptr.data;
			ptr = ptr.next;
		}

		System.out.println (sum);
	}
}
