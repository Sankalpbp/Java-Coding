import java.util.*;
import java.io.*;

public class LowerToUpper {
		
	public static void main (String [] args) throws IOException {
			
		String s;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		s = input.readLine();

		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; ++i) {
			if (charArray[i] != ' ')
				charArray[i] += ('A' - 'a');
		}

		String newString = new String (charArray);
		System.out.println(newString);
	}
}
