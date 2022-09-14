public class Remove_duplicates {
    public static boolean map[] = new boolean[26];
    public static String s = "";
    public static void removeDuplicates(String str, int n){
        if(str.length() > n){
            if(map[str.charAt(n) - 'a'] == true){
                removeDuplicates(str, n+1);
            }
            else{
                s = s + str.charAt(n);
                map[str.charAt(n) - 'a'] = true;
                removeDuplicates(str, n+1);
            }
        }
        else{
            System.out.println("New string is: "+ s);
            return;
        }
        
    }

    public static void main(String[] args) {
        removeDuplicates("abrakadabra", 0);
    }
}
