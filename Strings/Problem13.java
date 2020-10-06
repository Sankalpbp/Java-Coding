import java.util.*;
import java.io.*;

public class Problem13 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = "";
		String line = "";

		int n = 2;
		while (n > 0) {
			line = input.readLine();
			s += line;
			s += "\n";
			--n;
		}

		String [] arr = new String [2];

		int i = 0;
		line = "";
		int index = 0;
		while (i < s.length()) {
			if (s.charAt(i) == '\n') {
				arr[index++] = line;
				line = "";
			} else {
				line += s.charAt(i);
			}
			++i;
		}


		String output = arr[1] + "\n" + arr[0];

		System.out.println (output);
	}
}
