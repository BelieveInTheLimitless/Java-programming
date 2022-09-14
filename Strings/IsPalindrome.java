import java.util.*;

public class IsPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(!Character.isLetterOrDigit(str.charAt(start))){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(str.charAt(end))){
                end--;
                continue;
            }
            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
                System.out.print("The string is not Palindrome!");
                return;
            }
            start++;
            end--;
        }
        System.out.print("The string is Palindrome!");
        return;
    }
}