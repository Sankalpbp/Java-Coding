import java.util.*;
import java.io.*;

public class Reverse {

	public static void swap (char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s = input.readLine();

		int i = 0; 
		int j = s.length() - 1;

		char[] sArr = s.toCharArray();

		while (i < j) {
			swap(sArr, i, j);
			++i;
			--j;
		}

		System.out.println (sArr);

		/*
		   We can also reverse a string using an API provided by java for StringBuilder
		   StringBuilder s = "asdf";
		   s = s.reverse();
		*/
	}
}
