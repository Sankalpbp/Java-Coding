import java.util.*;
import java.io.*;

public class Problem13 {
	

	public static void interchange (int [] arr) {
			
		int n = arr.length;
		int max = arr[0];
		int maxIndex = 0;
		int secMaxIndex = 0;
		int secMax = arr[0];

		for (int i = 1; i < n; ++i) {
			if (max < arr[i]) {
				secMaxIndex = maxIndex;
				secMax = max;
				maxIndex = i;
				max = arr[i];
			} else if (secMax < arr[i]) {
				secMax = i;
				secMax = arr[i];
			}
		}

		int min = arr[0];
		int minIndex = 0;
		int secMinIndex = 0;
		int secMin = arr[0];

		for (int i = 1; i < n; ++i) {
			if (min > arr[i]) {
				secMinIndex = minIndex;
				secMin = min;
				minIndex = i;
				min = arr[i];
			} else if (secMin > arr[i]) {
				secMin = i;
				secMin = arr[i];
			}
		}

		int temp = arr[secMinIndex];
		arr[secMinIndex] = arr[secMaxIndex];
		arr[secMaxIndex] = temp;

		return;
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		Random random = new Random();

		int n = Integer.parseInt(input.readLine());

		int [] arr = new int [n];
		for (int i = 0; i < n; ++i) {
			arr[i] = random.nextInt(1000);
		}

		for (int i = 0; i < n; ++i) {
			System.out.print (arr[i] + " ");
		}
		System.out.println ();

		interchange(arr);

		for (int i = 0; i < n; ++i) {
			System.out.print (arr[i] + " ");
		}
		System.out.println ();
	}
}
