import java.util.*;
import java.io.*;

public class Problem20 {
		
	public static void main (String [] args) {
			
		String s = "Oxford Press";
		String t = "University";

		String result = s.substring(0, 7) + t + " " + s.substring(7, 12);

		System.out.println (result);
	}
}
