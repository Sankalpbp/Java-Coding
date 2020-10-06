import java.util.*;
import java.io.*;

public class Problem28 {

	public static int found(String text, String pattern) {
			
		boolean notFound = false;
		int index = 0;

		for (int i = 0; i < text.length(); ++i) {
				
			notFound = false;
			
			for (int j = 0; j < pattern.length(); ++j) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					notFound = true;
					break;
				}
			}

			if (notFound == false) {
				return i;
			}
		}

		return -1;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String text = input.readLine();
		String pattern = input.readLine();

		int index = found(text, pattern);
		if (index != -1) {
			text = text.substring (0, index - 1) + text.substring(index + pattern.length());
		}

		System.out.println (text);
	}
}
