import java.util.*;
import java.io.*;

public class Problem2 {
		
	public static void main (String[] args) {
			
		int [] arr = new int [100];

		Random random = new Random();

		for (int i = 0; i < 100; ++i) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < 100; ++i) {
			for (int j = i + 1; j < 100; ++j) {
				if (arr[i] + arr[j] == 50) {
					System.out.println (arr[i] + " , " + arr[j]);
				}
			}
		}
	}
}
