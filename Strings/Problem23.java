import java.util.*;
import java.io.*;

public class Problem23 {
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String s = "Good Morning";

		String result = s.substring (0, 5) + "Eve" + s.substring (8);

		System.out.println (result);
	}
}
