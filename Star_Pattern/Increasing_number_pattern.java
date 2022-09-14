import java.util.*;
public class Increasing_number_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pyramid : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
