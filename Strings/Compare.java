import java.util.*;
import java.io.*;

public class Compare {
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s1 = input.readLine();
		String s2 = input.readLine();

		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				++i;
				++j;
			} else if (s1.charAt(i) > s2.charAt(j)) {
				System.out.println (s1 + " is > " + s2);
				break;
			} else {
				System.out.println (s2 + " is > " + s1);
				break;
			}
		}

		if (i == s1.length() && j == s2.length()) {
			System.out.println (s1 + " and " + s2 + " are equal");	
		} else if (i == s1.length()) {
			System.out.println (s2 + " is bigger.");
		} else {
			System.out.println (s1 + " is bigger.");
		}

		/*
			we can also use these two functions: 
			1. str1.equals(str2) => gives the boolean true or false
			2. str1.compareTo(str2) => gives 0 if equal, 1 if str1 > str2, -1 if str1 < str2
		*/
	}
}
