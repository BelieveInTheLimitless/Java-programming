import java.util.*;

public class LL_Collections {
    public static void main(String[] args) {

        LinkedList<Integer> List = new LinkedList<Integer>();
        List.addFirst(5);
        List.add(10);
        List.add(15);
        System.out.println(List);
        System.out.println(List.size());
        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i)+ " -> ");
        }
        System.out.println("null");
        // List.removeFirst();
        // System.out.println(List);
        // List.removeLast();
        // System.out.println(List);
        List.remove(1);       
        System.out.println(List); 
    }

}
