import java.util.*;
import java.io.*;

public class Problem6 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		int upperCase = 0;
		int lowerCase = 0;
		int digit = 0;
		int special = 0;
		int spaces = 0;

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				++upperCase;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				++lowerCase;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				++digit;	
			} else if (s.charAt(i) == ' ') {
				++spaces;
			} else {
				++special;
			}
		}


		System.out.println (upperCase);
		System.out.println (lowerCase);
		System.out.println (digit);
		System.out.println (special);
		System.out.println (spaces);
	}
}
