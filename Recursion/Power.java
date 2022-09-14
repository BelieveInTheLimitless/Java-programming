import java.util.Scanner;

public class Power {

    public static int power(int key, int n){
        if(n == 0) return 1;
        //stack height = n
        // int x = key * power(key, n-1);
        // return x;

        //stack height = logn
        if(n % 2 == 0){
            return power(key, n/2) * power(key, n/2);
        }
        else{
            return power(key, n/2) * power(key, n/2) * key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n;
        System.out.print("Enter the base : ");
        x = sc.nextInt();
        System.out.print("Enter the index : ");
        n = sc.nextInt();
        System.out.println("The "+n+"th power of "+ x+ " is : "+ power(x, n));
    }
}
