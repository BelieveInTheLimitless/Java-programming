import java.util.Scanner;

public class Fibonacci{

    public static void fibonacci(int n, int a, int b){
        if(n == 0)
            return ;
        int c = a + b;
        System.out.println(c);
        fibonacci(n-1, b, c);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        fibonacci(n-2, 0, 1);
    }
}