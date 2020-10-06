import java.util.*;
import java.io.*;

public class Problem22 {

	public static String arrange (String s, int n) {
			
		String result = "";
		for (int i = s.length() - n; i < s.length(); ++i) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				String t = String.valueOf(s.charAt(i)).toUpperCase();
				result += t;
			} else {
				result += s.charAt(i);
			}
		}

		return result;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();
		int n = Integer.parseInt(input.readLine());

		String result = "";

		if (n < s.length()) {
			result = arrange(s, n);
		}

		System.out.println (result);
	}
}
