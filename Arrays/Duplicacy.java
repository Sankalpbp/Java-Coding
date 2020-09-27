import java.util.*;
import java.io.*;

public class Duplicacy {
		
	public static void main (String[] args) throws IOException {
			
		List<Integer> list = new ArrayList<Integer> ();

		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt (input.readLine());

		for (int i = 0; i < n; ++i) {
			int x = Integer.parseInt (input.readLine());
			list.add(x);
		}

		boolean duplicacy = false;

		for (int i = 0; i < list.size(); ++i) {
			for (int j = i + 1; j < list.size(); ++j) {
				if (list.get(i) == list.get(j)) {
					duplicacy = true;
					break;
				}
			}
		}

		if (duplicacy) {
			System.out.println("There is duplicacy");
		} else {
			System.out.println ("There is no duplicacy");
		}
	}
}
