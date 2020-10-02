import java.util.*;
import java.io.*;

public class ReadParagraph {
		
	public static void main (String [] args) throws IOException {
			
		String line = "";
		String paragraph = "";

		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader input = new BufferedReader (isr);

		do {
			line = input.readLine();	
			paragraph += line + "\n";
		} while (line.equals("exit") == false);

		input.close();
		isr.close();

		int i = 0;
		int lines = 0;
		int words = 0;
		int characters = 0;

		while (i < paragraph.length()) {
				
			if (paragraph.charAt(i) == '\n') {
				++words;
				++lines;
			} 

			if (paragraph.charAt(i) == ' ') {
				++words;
			}

			++characters;
			++i;
		}

		System.out.println (lines);
		System.out.println (words);
		System.out.println (characters);
	}
}
