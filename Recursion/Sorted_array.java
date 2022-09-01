//It should be strictly increasing sorted array
public class Sorted_array {

    public static void isSorted(int arr[], int n){
        if(n < arr.length-1){
            System.out.println("The array is sorted");
            return;
        }
        if(arr[n] < arr[n+1]){
            isSorted(arr, n+1);
        }
        else{
            System.out.println("The array is not sorted");
            return ;
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        isSorted(a, 0);
        
    }
}
