import java.util.*;
import java.io.*;

public class AppendingTwoStrings {
		
	public static void main (String [] args) throws IOException {
			
		String a, b;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		a = input.readLine();
		b = input.readLine();

		for (int i = 0; i < b.length(); ++i) {
			a += b.charAt(i);
		}

		/*
			Or we can simply use:
			String c = a.concat(b);
			This will return the concatenated string

		   */

		System.out.println(a);
	}
}
