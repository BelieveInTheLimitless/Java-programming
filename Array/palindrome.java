import java.util.Scanner;

public class palindrome {

    static int isPalindrome(int A[], int n){

        int i = 0, j = n-1;
        while(i<j){
            if(A[i] != A[j])
                return 0;
            i++;
            j--;
        }
        return 1;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = isPalindrome(arr, n);
        if(ans == 1)
            System.out.println("The array is palindrome");
        else
            System.out.println("The array is not palindrome");

        
    }
}
