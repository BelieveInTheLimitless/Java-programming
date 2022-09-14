public class Selection_Sort {
    
        //Time complexity - O(n^2) 
    public static void selectionSort(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
        selectionSort(a);
    }
}
