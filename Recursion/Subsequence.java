public class Subsequence {

    //Time complexity - O(2^n)
    public static void subsequences(String str, int n, String newString){

        if(str.length() == n){
            System.out.println(newString);
            return;
        }
        //to be in the string
        subsequences(str, n+1, newString + str.charAt(n));
        //not to be in the string 
        subsequences(str, n+1, newString);
    }

    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}
