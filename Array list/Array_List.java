import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        list.set(0, 15);
        list.set(1, 10);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        list.remove(0);
        list.remove(0);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        for(int i = 0; i < list.subList(0, 5).size(); i++){
            System.out.print(list.subList(0, 5).get(i)+" ");
        }
        System.out.println();
    }
}
