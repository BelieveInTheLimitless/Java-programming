import java.util.Scanner;

//time complexity = O(n = string length)
public class Reverse_string {

    public static void reverseTheString(String str, int l){
        if(l == 0){
            System.out.print(str.charAt(l));
            return;
        }
        System.out.print(str.charAt(l));
        reverseTheString(str, l-1);

    }
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseTheString(str, str.length()-1);
    }
}
