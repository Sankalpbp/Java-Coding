class GfG
{
    void buildHeap(int arr[], int n)
    {
        // heapify non - leaves from the end
        
        for (int i = (n / 2); i >= 0; --i) {
            heapify (arr, n, i);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        int greatest = i;
        
        if (left < n && arr[left] > arr[greatest]) {
            greatest = left;   
        }
        
        if (right < n && arr[right] > arr[greatest]) {
            greatest = right;
        }
        
        if (greatest != i) {
            int temp = arr[i];
            arr[i] = arr[greatest];
            arr[greatest] = temp;
            
            heapify (arr, n, greatest);
        }
    }
 }
