class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int maxIndex = i;
        
        for (int j = i - 1; j >= 0; --j) {
            if (arr[maxIndex] < arr[j]) {
                maxIndex = j;
            }
        }
        
        return maxIndex;
	}
	
	void selectionSort(int arr[])
	{
		int n = arr.length;
		for(int i=n-1; i>=0; i--)
		{
			int j = select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
}
