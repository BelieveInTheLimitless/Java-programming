public class QuickSort {
    //Divide and conquer algorithm
    // Basis - Pivot(last element) and partition
    //Time complexity  
    //Worst case - O(n^2) - in case of sorted array, n (because of loop) * n (because of n times pivoting)
    //Average - O(nlogn)
    //Merge sort is preffered when memory contraints are not there. If low memory is available, then quick sort is preffered.

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; //pivot index
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivit_index = partition(arr, low, high);

            quickSort(arr, low, pivit_index-1);
            quickSort(arr, pivit_index+1, high);
        }
    }


    public static void main(String[] args) {
        int a[] = {2, 4, 5, 3, 9, 8};
        quickSort(a, 0, a.length-1);

        System.out.print("Sorted array is : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
