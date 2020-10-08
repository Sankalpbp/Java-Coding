import java.util.*;
import java.io.*;

public class CircularLinkedListOperations {
		
	public static void main (String [] args) throws IOException {
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));	

		CircularLinkedList cll = new CircularLinkedList ();
		int option = -1;

		do {
				
			System.out.println ("1. Display");
			System.out.println ("2. Insert at Beginning");
			System.out.println ("3. Insert at End");
			System.out.println ("4. Delete at Beginning");
			System.out.println ("5. Delete at End");
			System.out.println ("6. Insert After");
			System.out.println ("7. Insert Before");
			System.out.println ("8. Delete Before");
			System.out.println ("9. Delete After");
			System.out.println ("10. Delete List");
			System.out.println ("0. EXIT");

			option = Integer.parseInt (input.readLine ());
			
			switch (option) {
					
				case 1:
					cll.traverse ();
					break;

				case 2:
					cll.insertBeginning ();
					break;

				case 3:
					cll.insertEnd ();
					break;

				case 4:
					cll.deleteBeginning ();
					break;

				case 5:
					cll.deleteEnd ();
					break;

				case 6:
					int key = Integer.parseInt (input.readLine ());
					cll.insertAfter (key);
					break;
				
				case 7:
					key = Integer.parseInt (input.readLine ());
					cll.insertBefore (key);
					break;

				case 8:
					key = Integer.parseInt (input.readLine ());
					cll.deleteBefore (key);
					break;

				case 9:
					key = Integer.parseInt (input.readLine ());
					cll.deleteAfter (key);
					break;

				case 10:
					cll.deleteList ();
					break;
			}

		} while (option != 0);
	}
}
