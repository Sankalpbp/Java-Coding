import java.util.*;
import java.io.*;

public class Problem18 {

	public static String reverse (String s) {
			
		int i = 0;
		int j = s.length () - 1;

		char [] arr = s.toCharArray();

		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			++i;
			--j;
		}

		s = String.valueOf(arr);
		return s;
	}
		
	public static void main (String [] args) {
			
		String s = "hello world";

		s = reverse (s);

		System.out.println (s);
	}
}
