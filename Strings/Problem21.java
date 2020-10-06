import java.util.*;
import java.io.*;

public class Problem21 {

	public static String removeCharacter (String s, int index) {
		return s.substring (0, index) + s.substring (index + 1);
	}

	public static String replaceCharacter (String s, int index, char ch) {
		return s.substring (0, index) + ch + s.substring (index + 1);
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();


		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ';') {
				s = removeCharacter (s, i);
			} else if (s.charAt(i) == '.') {
				s = replaceCharacter (s, i, ',');
			}
		}

		System.out.println (s);
	}
}
