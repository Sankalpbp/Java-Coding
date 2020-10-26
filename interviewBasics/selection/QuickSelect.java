/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSelect {
    
    public static int partition (int [] arr, int start, int end) {
        
        int pivot = arr[end];
        
        int i = start - 1;
        
        for (int j = start; j < end; ++j) {
            if (pivot >= arr[j]) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        
        return (i + 1);
    }
    
    public static int quickSelect (int [] arr, int start, int end, int k) {
        
        if (start > end) {
            return -1;
        }
        
        int pIndex = partition (arr, start, end);
        
        if (pIndex == k - 1) {
            return arr[pIndex];
        } else if (pIndex > (k - 1)) {
            return quickSelect (arr, start, pIndex - 1, k);
        }
        
        return quickSelect (arr, pIndex + 1, end, k);
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
            
            int k = input.nextInt ();
            
            int data = quickSelect(arr, 0, n - 1, k);
            if (data == -1) {
                System.out.println ("-1");                
            } else {
                System.out.println (data);
            }

            t -= 1;
        }
	}
}
