public class Permutations{

    //Time complexity = O(n*n!)
    public static void printPermutations(String str, String permutation, int n){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, permutation+currChar, n+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "", 0);
    }
}