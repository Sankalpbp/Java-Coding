import java.util.*;
import java.io.*;

public class AppendingTwoStrings {
		
	public static void main (String [] args) throws IOException {
			
		String a, b;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		a = input.readLine();
		b = input.readLine();

		for (int i = 0; i < b.length(); ++i) {
			a += b.charAt(i);
		}

		System.out.println(a);
	}
}
