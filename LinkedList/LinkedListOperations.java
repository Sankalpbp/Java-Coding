import java.util.*;
import java.io.*;

public class LinkedListOperations {
		
	public static void main (String [] args) throws IOException {
			
		LinkedList l = new LinkedList ();
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int option = -1;

		do {
				
			System.out.println ("1. Display");
			System.out.println ("2. Insert at Beginning");
			System.out.println ("3. Insert at End");
			System.out.println ("4. Insert Before");
			System.out.println ("5. Insert After");
			System.out.println ("6. Delete Beginning");
			System.out.println ("7. Delete End");
			System.out.println ("8. Delete After");
			System.out.println ("9. Delete Before");
			System.out.println ("10. Delete List");
			System.out.println ("11. Sort List");
			System.out.println ("0. Exit");
			
			option = Integer.parseInt(input.readLine());

			switch (option) {
					
				case 1:
					l.traverse();
					break;

				case 2:
					l.insertBeginning();
					break;

				case 3:
					l.insertEnd();
					break;
				case 4:
					System.out.println ("Enter the key: ");
					int key = Integer.parseInt(input.readLine());
					l.insertBefore(key);
					break;
				case 5:
					System.out.println ("Enter the key: ");
					key = Integer.parseInt(input.readLine());
					l.insertAfter(key);
					break;

				case 6:
					l.deleteBeginning();
					break;

				case 7:
					l.deleteEnd();
					break;

				case 8:
					System.out.println ("Enter the key: ");
					key = Integer.parseInt(input.readLine());

					l.deleteAfter(key);
					break;

				case 9:
					System.out.println ("Enter the key: ");
					key = Integer.parseInt(input.readLine());
					
					l.deleteBefore(key);
					break;

				case 10:
					l.deleteList();
					break;

				case 11:
					l.sort();
					break;
			}
		} while (option != 0);
	}
}
