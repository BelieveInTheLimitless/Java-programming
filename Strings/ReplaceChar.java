import java.util.Scanner;

public class ReplaceChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String old = sc.next();
        String result = "";
        for(int i = 0; i < old.length(); i++){
            if(old.charAt(i) == 'e'){
                result += "i";
            }
            else{
                result += old.charAt(i);
            }
        }
        System.out.println(result);
    }
}
