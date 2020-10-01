import java.util.*;
import java.io.*;

public class Length {
		
	public static void main (String [] args) throws IOException {
			
		String s = null;

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		s = input.readLine();

		System.out.println (s.length());
	}
}
