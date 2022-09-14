import java.util.*;

//time complexity = O(n)
public class Occurance {
    public static int first = -1, last = -1;
    public static void count(String str, char c, int n){
        if(str.length() > n){
            if(first == -1 && str.charAt(n) == c){
                first = last = n;
            }
            else if(str.charAt(n) == c){
                last = n;
            }
            count(str, c, n+1);
        }
        else{
            System.out.println("First occurance : "+first+"\nLast occurance : "+last);
            return;
        }    
    }
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter the character : ");
        char c = sc.nextLine().charAt(0);
        int n = 0;
        count(str, c, n);
    }
}
