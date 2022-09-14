import java.util.Scanner;


public class Fibonacci {

    public static void fibonacci(int arr[], int n){

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = -1;
        }

        fibonacci(arr, n);
    }
}
