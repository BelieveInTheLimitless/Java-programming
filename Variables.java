import java.util.Scanner;
public class Variables {
    public static void main(String args[]) {
        int a,b,sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            a=sc.nextInt();
            System.out.print("Enter b : ");
            b=sc.nextInt();
        }
        sum=a+b;
        System.out.print("The sum is : ");
        System.out.print(sum);
    }
}
