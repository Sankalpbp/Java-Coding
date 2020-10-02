import java.util.*;
import java.io.*;

public class Problem1 {
		
	public static void main (String[] args) throws IOException {
			
		int [][] marks = new int[20][5];
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j < 5; ++j) {
				marks[i][j] = i * 1 + j * 2;
			}
		}

		for (int i = 0; i < 5; ++i) {
			int sum = 0;

			for (int j = 0; j < 20; ++j) {
				sum += marks[j][i];
			}

			System.out.println ("For the subject " + (i + 1) + " = " + sum / 5);
		}

		System.out.println ("\n\n\n");
		int below50 = 0;
		
		for (int i = 0; i < 20; ++i) {
			int sum = 0;
			for (int j = 0; j < 5; ++j) {
				sum += marks[i][j];
			}

			System.out.println ("For the student " + (i + 1) + " = " + sum / 20);
			if (sum / 20 < 50) {
				++below50;
			}
		}

		System.out.println ("\n\n\n\n");


		System.out.println (below50 + " students got below 50.");


		System.out.println ("\n\n\n\n");


		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.print(marks[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
