public class StringBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        sb.append(" Stark");
        // System.out.println(sb);

        // sb.insert(0, "Mr. ");
        // System.out.println(sb);

        // sb.deleteCharAt(3);
        // System.out.println(sb);

        // sb.replace(0, 7, "Ms. Pots");
        // System.out.println(sb);

        // sb.delete(0, 4);
        // System.out.println(sb);

        //Reversing a string
        //sb.reverse(); - method
        int i = 0;
        int j = sb.length()-1;
        while(i < j){
            sb.append(sb.charAt(j-1));
            sb.deleteCharAt(j-1);
            j--;
        }
        System.out.println(sb);
    }
}
