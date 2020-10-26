import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionDeletion {

    public static void heapify (ArrayList<Integer> minHeap, int i) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int smallest = i;

        if (left < minHeap.size() && minHeap.get(smallest) > minHeap.get(left)) {
            smallest = left;
        }

        if (right < minHeap.size() && minHeap.get(smallest) > minHeap.get(right)) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = minHeap.get(i);
            minHeap.set(i, minHeap.get(smallest));
            minHeap.set (smallest, temp);

            heapify (minHeap, smallest);
        }
    }

    public static void pop (ArrayList<Integer> minHeap) {

        minHeap.set(0, minHeap.get(minHeap.size () - 1));
        minHeap.remove(minHeap.size() - 1);

        heapify (minHeap, 0);
    }

    public static void delete (ArrayList<Integer> minHeap, int data) {

        int index = -1;

        for (int i = 0; i < minHeap.size(); ++i) {
            if (minHeap.get(i) == data) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            decreaseKey (minHeap, index, Integer.MIN_VALUE);
            pop (minHeap);
        }
    }

    public static void decreaseKey (ArrayList<Integer> minHeap, int index, int data) {

        // fill in the data
        minHeap.set(index, data);

        while (index > 0 && (minHeap.get(index) < minHeap.get((index - 1) / 2))) {
            int temp = minHeap.get(index);
            minHeap.set(index, minHeap.get((index - 1) / 2));
            minHeap.set((index - 1) / 2, temp); 
            index = (index - 1) / 2;
        }
    }

    public static void insert (ArrayList<Integer> minHeap, int data) {

        minHeap.add(Integer.MAX_VALUE);
        decreaseKey (minHeap, minHeap.size() - 1, data);
    }

    public static void printMinimum (ArrayList<Integer> minHeap) {

        System.out.println (minHeap.get(0));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // we are here doing hackerRank

        Scanner input = new Scanner (System.in);
        int queries = input.nextInt ();

        ArrayList<Integer> minHeap = new ArrayList<Integer> ();

        while (queries > 0) {

            int option = 0;
            int data = 0;

            option = input.nextInt ();

            if (option == 1) {
                data = input.nextInt ();
                insert (minHeap, data);
            } else if (option == 2) {
                data = input.nextInt ();
                delete (minHeap, data);
            } else if (option == 3) {
                printMinimum (minHeap);
            }

            queries -= 1;
        }
    }
}

