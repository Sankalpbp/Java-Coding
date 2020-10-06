import java.util.*;
import java.io.*;

public class Problem27 {

	public static List<String> split (String s) {
			
		List<String> lines = new ArrayList<String> ();

		String line = "";
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '.') {
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

		String s = input.readLine();
		int m = Integer.parseInt(input.readLine());
		int n = Integer.parseInt(input.readLine());

		List<String> lines = split (s);
		System.out.println (lines.size());

		for (int i = m; i < n + m; ++i) {
			String x = lines.get(i);
			System.out.println (x);
		}
	}
}
