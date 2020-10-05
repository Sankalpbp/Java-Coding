import java.util.*;
import java.io.*;

public class Problem9 {

	public static int frequency (String s, String pattern) {
			
		int count = 0;

		boolean notFound = false;

		for (int i = 0; i < s.length(); ++i) {
				
			notFound = false;
			int k = 0;
			for (int j = i; j < s.length() && j < i + pattern.length();  ++j) {
				if (s.charAt(j) == s.charAt(k++)) {
					continue;
				} else {
					notFound = true;
					break;
				}
			}

			if (notFound == false) {
				++count;
			}
		}

		return count;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		String pattern = input.readLine();

		int count = frequency (s, pattern);

		System.out.println (count);
	}
}
