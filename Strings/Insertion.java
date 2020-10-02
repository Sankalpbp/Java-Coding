import java.util.*;
import java.io.*;

public class Insertion {
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Enter the main string: ");
		String s = input.readLine();

		System.out.println("Enter the instring: ");
		String instring = input.readLine();

		System.out.println ("Enter the index at which to put the instring: ");
		int k = Integer.parseInt(input.readLine());

		String newString = s.substring(0, k) + instring + s.substring(k);
		System.out.println (newString);
	}
}
