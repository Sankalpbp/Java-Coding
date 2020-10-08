import java.util.*;
import java.io.*;

public class DoublyLinkedListOperations {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		DoublyLinkedList dll = new DoublyLinkedList ();
		int option = -1;

		do {
			System.out.println ("1. Display");	
			System.out.println ("2. Insert Beginning");	
			System.out.println ("3. Insert End");	
			System.out.println ("4. Insert Before");	
			System.out.println ("5. Insert After");	
			System.out.println ("6. Delete Beginning");	
			System.out.println ("7. Delete End");	
			System.out.println ("8. Delete Before");
			System.out.println ("9. Delete After");	
			System.out.println ("10. Delete List");	
			System.out.println ("0. Exit");

			option = Integer.parseInt (input.readLine ());

			switch (option) {
					
				case 1:
					dll.traverse ();
					break;
				
				case 2:
					dll.insertBeginning ();
					break;

				case 3:
					dll.insertEnd ();
					break;

				case 4:
					int key = Integer.parseInt (input.readLine ());
					dll.insertBefore (key);
					break;

				case 5:
					key = Integer.parseInt (input.readLine ());
					dll.insertAfter (key);
					break;

				case 6:
					dll.deleteBeginning ();
					break;

				case 7:
					dll.deleteEnd ();
					break;

				case 8:
					key = Integer.parseInt (input.readLine ());
					dll.deleteBefore (key);
					break;

				case 9:
					key = Integer.parseInt (input.readLine ());
					dll.deleteAfter (key);
					break;

				case 10:
					dll.deleteList ();
					break;
			}

		} while (option != 0);
	}
}
