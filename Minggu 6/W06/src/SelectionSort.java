
public class SelectionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        int move = 0;
  
        
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            move++;
        }
        System.out.println("Sorted array");
        System.out.println("Mengalami " + move +" Swap");
    }
    // Tampilkan
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {7,4,5,9,8,2,1};
        ob.sort(arr);
        ob.printArray(arr);  
    }
}
    
