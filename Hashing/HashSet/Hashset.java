import java.util.HashSet;
import java.util.Iterator;

//Insert, delete and searching operations are performed in O(1) time.
//Hashset does not store elements on the basis of order in which they are inserted neither it sorts them. 
//They are stored randomly.

class Hashset{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//Repeated element don't get added in set.

        System.out.println("Size of set is : "+set.size());

        System.out.println("Set : "+ set);

        Iterator<Integer> it = set.iterator();

        System.out.println("Printing the elements of set using iterater :");

        while(it.hasNext()){
            System.out.println(it.next());
        }

        set.remove(1);

        if(!set.contains(1)){
            System.out.println("1 is removed from Set.");
        }

        System.out.println("New set is : "+ set);

        if(!set.contains(6)){
            System.out.println("Set does not contain 6.");
        }

    }
}