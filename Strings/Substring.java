import java.util.*;
import java.io.*;

public class Substring {
		
	public static void main (String[] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		StringBuilder substr = new StringBuilder();

		System.out.println ("Enter the index from where to start the substring and the lenght of the substring: ");
		int k = Integer.parseInt(input.readLine());
		int size = Integer.parseInt(input.readLine());

		for (int i = 0; i < size; ++i) {
			substr.append(s.charAt(i + k));
		}

		System.out.println(substr);

		/*
		   substr = s.substring(index, size);
		*/
	}
}
