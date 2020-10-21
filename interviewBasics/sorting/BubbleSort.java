
class BubbleSort
{
    
	static void bubbleSort(int arr[], int n)
	{
	   for (int i = 0; i < n-1; i++)      
			bubble(arr, i, n);
	}

    static void swap (Integer i, Integer j) {
        int temp = i;
        i = j;
        j = temp;
    }

	static void bubble(int arr[], int i, int n)
    {
       for (int j = 0; j < (n - 1 - i); ++j) {
           if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
           }
       }
    }
}
