import java.util.*;

public class StackCollection{

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while(!st.isEmpty()){
            System.out.print(st.pop()+" -> ");
        }
        System.out.print("null");

    }
}
