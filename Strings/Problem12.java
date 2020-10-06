import java.util.*;
import java.io.*;

public class Problem12 {

	public static List<String> split (String s) {
			
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

		return output;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		List<String> words = split (s);
		StringBuilder f = new StringBuilder ();

		Iterator it = words.iterator();
		while (it.hasNext()) {
			f.append(it.next());
			f.append(" ");
		}

		Collections.reverse (words);

		for (int i = 0; i < words.size() - 1; ++i) {
			f.append(words.get(i));
			f.append(" ");
		}

		f.append(words.get(words.size() - 1));

		System.out.println (f);
	}
}
