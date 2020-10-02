import java.util.*;
import java.io.*;

public class Palindrome {

	public static boolean isPalindrome (String s) {
		
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			++i;
			--j;
		}

		return true;
	}
		
	public static void main (String [] args) throws IOException {
			
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader input = new BufferedReader (isr);

		String s = input.readLine();

		System.out.println (isPalindrome (s));

		input.close();
		isr.close();
	}
}
