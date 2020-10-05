import java.util.*;
import java.io.*;

public class Problem11 {

	public static String reverse (String word) {
			
		char [] arr = word.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			++i;
			--j;
		}

		String s = String.valueOf(arr);

		return s;
	}

	public static List<String> split (String s) {
			
		List<String> output = new ArrayList<String> ();
		String word = "";

		for (int i = 0; i < s.length(); ++i) {
				
			if (s.charAt(i) == ' ') {
				String reversed = reverse(word);
				output.add(reversed);
				word = "";
			} else {
				word += (s.charAt(i));
			}
		}

		String reversed = reverse (word);
		output.add(reversed);
		
		return output;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		List<String> output = split(s);
		
		for (String x : output) {
			System.out.println (x);
		}
	}
}
