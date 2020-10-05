import java.util.*;
import java.io.*;

public class Problem7 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = input.readLine();
		char ch = input.readLine().charAt(0);

		int count = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ch) {
				++count;
			}
		}

		System.out.println (count);
	}
}
