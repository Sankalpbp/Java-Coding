import java.util.*;
import java.io.*;

public class Replace {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = input.readLine();

		String replaced = input.readLine();
		String toReplace = input.readLine();

		int firstIndex = s.indexOf(replaced.charAt(0));
		int lastIndex = firstIndex + replaced.length();

		String str = "";

		str += s.substring (0, firstIndex);
		str += toReplace;
		str += s.substring (lastIndex);

		System.out.println (str);
	}
}
