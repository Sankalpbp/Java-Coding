import java.util.*;
import java.io.*;

public class Problem17 {
		
	public static void main (String [] args) {
			
		String a = "Good Morning";
		String b = "GOOD MORNING";

		int result = a.compareTo(b);

		if (result == 0) {
			System.out.println("Strings are equal");
		} else if (result > 0) {
			System.out.println(b + " is smaller than " + a);
		} else {
			System.out.println(a + " is smaller than " + b);
		}
	}
}
