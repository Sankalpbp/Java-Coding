/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void printKth (int [] arr, int k) {
        
        Arrays.sort(arr);
        System.out.println (arr[k - 1]);
    }
    
	public static void main (String[] args) throws IOException {
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt ();
        
        while (t > 0) {
            
            int n = (input.nextInt ());
            int [] arr = new int[n];
            
            for (int i = 0; i < n; ++i) {
                arr[i] = (input.nextInt());
            }
            
            int k = (input.nextInt());
            
            printKth(arr, k);
            
            t -= 1;
        }
	}
}
