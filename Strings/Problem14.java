import java.util.*;
import java.io.*;

public class Problem14 {


	public static List<String> splitLines (String s) {
			
		String line = "";
		List<String> lines = new ArrayList<String> ();

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '\n') {
				lines.add(line);
				line = "";
			} else {
				line += s.charAt(i);
			}
		}

		return lines;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = "";
		String line = "";

		do {
			line = input.readLine();
			s += line;
			s += "\n";
		} while (line.equals("exit") == false);

		List<String> lines = splitLines (s);

		for (String x : lines) {
			System.out.println (x);
		}
	}
}
