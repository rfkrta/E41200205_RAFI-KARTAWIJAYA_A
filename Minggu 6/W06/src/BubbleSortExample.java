
public class BubbleSortExample {

    static void BubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int move = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    move++;
                }
            }
        }
        System.out.println("Melakukan swap sebanyak : " + move);
    }
    
    static void BubbleSortDescending(int[] arr) {
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    swap = true;
                    if (swap) {
                        swap_count++;
                    }
                }
            }
        }
        System.out.println("Melakukan swap sebanyak : " + swap_count);
    }
    
    public static void main (String[] args)
    {
        int arr[] = {7,4,5,9,8,2,1};
        System.out.println("Array Sebelum Bubble Sort");
        
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        BubbleSort(arr);
        System.out.println("Array Sesudah Bubble Sort ASC");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        BubbleSortDescending(arr);
        System.out.println("Array Sesudah Bubble Sort DESC");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }  
    
}
