import java.util.*;
import java.io.*;

public class Problem11a {

	public static List<String> splitReverse (String s) {
			
		List<String> output = new ArrayList<String> ();

		String word = "";
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ' ') {
				output.add(word);
				word = "";
			} else {
				word += s.charAt(i);	
			}
		}

		output.add(word);
		Collections.reverse(output);

		return output;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = input.readLine();
		List<String> output = splitReverse (s);

		Iterator iterator = output.iterator();

		StringBuilder f = new StringBuilder ();
		for (int i = 0; i < output.size() - 1; ++i) {
			f.append(output.get(i));
			f.append(" ");
		}

		f.append(output.get(output.size() - 1));

		System.out.println(f);
	}
}
