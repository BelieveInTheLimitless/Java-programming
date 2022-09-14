public class Move_char {
//Time complexity = O(n)
    public static int n = 0, count = 0;
    public static StringBuilder sb = new StringBuilder("");
    public static void moveChar(String str, char c, int n){
        if(str.length() > n){
            if(str.charAt(n) == c){
                count +=1;
            }
            else{
                sb = sb.append(str.charAt(n));
            }
            moveChar(str, c, n+1);
        }
        else{
            while(count > 0){
                sb = sb.append(c);
                count--;
            }
            System.out.println("New string is : "+ sb);
        }
    }
    public static void main(String[] args) {
        String str = "absdedrtddx";
        moveChar(str, 'd', n);
    }
}
