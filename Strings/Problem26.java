import java.util.*;
import java.io.*;

public class Problem26 {

	public static void writeAsStory (String s) {
			
		String line = "";

		int lineNumber = 1;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '.') {
				System.out.println (lineNumber++ + ". " + line);
				line = "";
			} else {
				line += s.charAt(i);
			}
		}
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		writeAsStory(s);
	}
}
