import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSort {

    public static void merge (int [] arr, int l, int m, int r) {
             // Your code here
		 int n1 = m - l + 1;
		 int n2 = r - m;
		 
		 int [] left = new int [n1 + 1];
		 int [] right = new int [n2 + 1];
		 
		 for (int i = 0; i < n1; ++i) {
			 left[i] = arr[l + i];
		 }
		 
		 left[n1] = Integer.MAX_VALUE;
		 
		 for (int i = 0; i < n2; ++i) {
			right[i] = arr[m + 1 + i];   
		 }
		 
		 right[n2] = Integer.MAX_VALUE;
		 
		 int i = 0;
		 int j = 0;
		 
		 for (int k = l; k <= r; ++k) {
			if (left[i] > right[j]) {
				arr[k] = right[j];
				++j;
			} else {
				arr[k] = left[i];
				++i;
			}
		 }
    }
    
    public static void mergeSort (int [] arr, int left, int right) {
        
        if (left < right) {
            // if there are more than one elements
            // only then, we will call for the parts
            
            int mid = left + (right - left) / 2;
            
            mergeSort (arr, left, mid);
            mergeSort (arr, mid + 1, right);
            
            merge (arr, left, mid, right);
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner (System.in);
        int n = input.nextInt ();
        
        int [] arr = new int[n];
        
        for (int i = 0; i < n; ++i) {
            arr[i] = input.nextInt ();
        }
        
        mergeSort (arr, 0, n - 1);
        
        System.out.print ("[");
        for (int i = 0; i < n - 1; ++i) {
            System.out.print (arr[i] + ",");
        }
        System.out.print (arr[n - 1] + "]");
    }
}
