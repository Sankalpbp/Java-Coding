import java.util.*;
import java.io.*;

public class Problem10 {

	public static int lastInstance (String s, String word) {
			
		int index = -1;

		boolean notFound = true;
		for (int i = 0; i < s.length(); ++i) {
				
			notFound = false;
			int k = 0;
			for (int j = i; j < s.length() && j < i + word.length(); ++j) {
				if (s.charAt(j) == word.charAt(k++)) {
					continue;	
				} else {
					notFound = true;
					break;
				}
			}

			if (notFound == false) {
				index = i;	
			}
		}

		return index;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = input.readLine();
		String word = input.readLine();

		System.out.println (lastInstance (s, word));
	}
}
