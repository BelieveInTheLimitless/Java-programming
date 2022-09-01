public class Bubble_Sort {

    //Time complexity - O(n^2)
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        System.out.print("Sorted array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }  
    }

    public static void main(String[] args) {
        int a[] = {3, 5, 7, 4, 8, 2, 10};
        bubbleSort(a);
    }
}
