import java.util.*;
import java.io.*;

public class PolynomialLinkedListOperations {
		
	public static void main (String [] args) throws IOException {
			
		PolynomialLinkedList one = new PolynomialLinkedList ();
		PolynomialLinkedList two = new PolynomialLinkedList ();

		one.traverse ();
		two.traverse ();

		PolyNode added = one.add(two);
		while (added != null) {
			System.out.print (added.coefficient + "x^" + added.power + " + ");
			added = added.next;
		}

		System.out.println ();
	}
}
