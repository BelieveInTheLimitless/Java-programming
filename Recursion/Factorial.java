import java.util.Scanner;

public class Factorial{
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int x = n * factorial(n-1);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Factorial of "+number+" is : "+ factorial(number));
    }
}