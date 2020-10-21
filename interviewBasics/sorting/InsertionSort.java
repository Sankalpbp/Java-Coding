
class InsertionSort
{
	static void insertionSort(int arr[], int n)
	{
	  GfG obj = new GfG();
	   for (int i = 1; i < n; i++)
		  obj.insert(arr, i);
	}

	  static void insert(int arr[],int j)
	  {   
		   int element = arr[j];
		   
		   int i = j - 1;
		   while (i >= 0 && arr[i] > element) {
			   arr[i + 1] = arr[i];
			   --i;
		   }
		   
		   arr[i + 1] = element;
	  }
}
