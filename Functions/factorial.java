import java.util.*;
public class factorial {
    public static int fact(int n){
        int x=1;
        for(int i=n;i>=1;i--){
            x=x*i;
        }
        return x;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int factorial= fact(n);
        System.out.print("The Factorial of " + n + " is : " + factorial );
    }
}