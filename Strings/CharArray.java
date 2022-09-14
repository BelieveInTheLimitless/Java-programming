public class CharArray {
    public static void main(String args[]){
        String str = "Mr. Tony Stark";
        char arr[] = str.toCharArray();

        System.out.println("Length of character array is "+ arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
