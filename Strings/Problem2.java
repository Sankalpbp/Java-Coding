import java.util.*;
import java.io.*;

public class Problem2 {
		
	public static void main (String [] args) throws IOException {
			
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader input = new BufferedReader (isr);

		String a = input.readLine();
		String b = input.readLine();

		int n = Integer.parseInt(input.readLine());

		String output = b + a.substring (0, n);

		System.out.println (output);

		input.close();
		isr.close();

	}
}
