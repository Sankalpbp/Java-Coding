import java.util.*;
import java.io.*;

public class Problem5 {
		
	public static void main (String [] args) throws IOException {
			
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader input = new BufferedReader (isr);

		String s = input.readLine();

		System.out.println ("Enter the character you want to replace and the character with which to replace: ");
		char ch1 = input.readLine().charAt(0);
		char ch2 = input.readLine().charAt(0);

		System.out.println (ch1 + " " + ch2);

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ch1) {
				s = s.substring(0, i) + ch2 + s.substring(i + 1);
				break;
			}
		}

		System.out.println (s);
	}
}
