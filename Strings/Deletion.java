import java.util.*;
import java.io.*;

public class Deletion {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		System.out.println ("Enter the index from where to delete: ");
		int k = Integer.parseInt(input.readLine());

		System.out.println ("Enter the number of characters to delete: ");
		int chars = Integer.parseInt(input.readLine());

		String finalString = s.substring(0, k) + s.substring(k + chars);

		System.out.println(finalString);
	}
}
