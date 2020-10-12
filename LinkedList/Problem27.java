import java.util.*;
import java.io.*;

public class Problem27 {
		
	public static void main (String [] args) throws IOException {
			
		CircularLinkedList cll = new CircularLinkedList ();

		Node ptr = cll.head;
		int count = 0;

		if (ptr.data != 0) {
			count += 1;
		}

		ptr = ptr.next;

		while (ptr != cll.head) {
			if (ptr.data != 0) {
				++count;
			}
			ptr = ptr.next;
		}

		System.out.println (count);
	}
}
