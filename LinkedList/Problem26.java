import java.util.*;
import java.io.*;

public class Problem26 {
		
	public static void main (String [] args) throws IOException {
			
		PolynomialLinkedList p = new PolynomialLinkedList ();

		PolyNode ptr = p.head;
		int n = Integer.parseInt (p.input.readLine ());

		while (ptr != null) {
			ptr.coefficient *= n;
			ptr = ptr.next;
		}

		p.traverse ();
	}
}
