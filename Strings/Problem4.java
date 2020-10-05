import java.util.*;
import java.io.*;

public class Problem4 {
		
	public static void main (String [] args) throws IOException {
			
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader input = new BufferedReader (isr);

		String s = input.readLine();

		char[] array = s.toCharArray();

		int start = 0;

		for (int i = 0; i < array.length; ++i) {
			if (array[i] == ' ') {
				continue;
			} else {
				start = i;
				break;
			}
		}

		int end = array.length - 1;

		for (int i = array.length - 1; i >= 0; --i) {
			if (array[i] == ' ') {
				continue;
			} else {
				end = i;
				break;
			}
		}

		String newS = s.substring (start, end - start + 1);

		System.out.println (newS);
	}
}
