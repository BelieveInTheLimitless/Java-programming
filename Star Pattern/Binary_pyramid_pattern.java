import java.util.*;
public class Binary_pyramid_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pyramid : ");
        int n=sc.nextInt();
        int num;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                num=j%2;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
