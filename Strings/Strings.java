import java.util.*;

public class Strings {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        //String name = sc.next();//Takes only one word as input
        String name1 = sc.nextLine();//Takes full line as input

        //System.out.println(name);
        // System.out.println(name1);

//Concatination is used to add to strings

        //printing the length of strings
        // System.out.println("Length of the string is "+fullName.length());

        //charAt function - Used for accesing individual character in a string
        // for(int i = 0; i <name1.length(); i++){
        //     System.out.println(name1.charAt(i));
        // }


        //compareTo() function - Compares first string with second string
        // String name2 = sc.nextLine();

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal.");
        // }
        // else{
        //     System.out.println("Strings are not equal!");
        // }

        //substring function - returns a substring in format substring(start index, end index[If not mentioned, consider it as last index])
        //Note - Indexing starts from 0.
        String name = name1.substring(11);
        //Taking "My name is Tony" as input, we get "Tony" as output.
        System.out.println(name);
    }
}
