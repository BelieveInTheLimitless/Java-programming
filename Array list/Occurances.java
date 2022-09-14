import java.util.ArrayList;

class Occurance{
    public static void main(String[] args) {
        int x = 5;
        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 10};

        ArrayList<Long> list = new ArrayList<>(2);
        list.add(Long.valueOf(-1));
        list.add(Long.valueOf(-1));
       
        for(int i=0;i<n;i++){
           if(arr[i]==x){
               list.set(0, Long.valueOf(i));
               break;
           }
       }
       
        for(int i=0;i<n;i++){
           if(arr[i]==x){
               list.set(1, Long.valueOf(i));
           }
       }

        for(int i = 0; i < 2; i++){
            System.out.println(list.get(i));
            
        }
    }
}