
class BubbleSort
{
    
	static void bubbleSort(int arr[], int n)
	{

	   for (int i = 0; i < n-1; i++) {
		   boolean noSwap = bubble(arr, i, n);
		   if (noSwap) {
			   // we are done with the sorting
			   return;
		   }
	   }
	}

    static void swap (Integer i, Integer j) {
        int temp = i;
        i = j;
        j = temp;
    }

	static boolean bubble(int arr[], int i, int n)
    {

		boolean noSwap = true;
       for (int j = 0; j < (n - 1 - i); ++j) {
           if (arr[j] > arr[j + 1]) {
			   	noSwap = false;
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
           }
       }

	   if (noSwap == true) {
		   return true;
	   }

	   return false;
    }
}
