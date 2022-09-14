public class Keypad_combinations {
    
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void printCombinations(String str, int n, String combination){

        if(n == str.length()){
            System.out.println(combination);
            return;
        }
        String mapping = keypad[str.charAt(n) - '0'];

        for(int i = 0; i < mapping.length(); i++){
            printCombinations(str, n+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        printCombinations("123", 0, "");
    }
}
