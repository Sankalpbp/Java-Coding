void quickSort(int arr[], int low, int high) {
    if (low < high)     {
        // pi is partitioning index, arr[p] is now  at right place
        int pi = partition(arr, low, high);
        // Separately sort elements before / partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int partition (int arr[], int low, int high)
{
   // Your code here
   int pivot = arr[high];
   
   int i = low - 1;
   
   for (int j = low; j < high; ++j) {
       if (arr[j] <= pivot) {
           ++i;
           
           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
       }
   }
   
   int temp = arr[i + 1];
   arr[i + 1]= arr[high];
   arr[high] = temp;
   
   return i + 1;
}
