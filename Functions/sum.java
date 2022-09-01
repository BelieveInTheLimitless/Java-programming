import java.util.*;
public class sum{
    public static int sumOfTwoNumbers(int a, int b){
        int x=a+b;
        return x;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        int sum = sumOfTwoNumbers(a,b);
        System.out.println("Sum is : "+sum);
    }
}