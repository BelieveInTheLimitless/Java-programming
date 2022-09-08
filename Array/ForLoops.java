public class ForLoops {
    
    public static void main(String[] args) {
        

        int arr[] = {1, 3, 5, 7, 9};
        System.out.print("Contents of array are : " );
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Contents of array using another for loop are : " );
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
