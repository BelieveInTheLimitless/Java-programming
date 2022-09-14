import java.util.HexFormat;

class Reverse_LL {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;    
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void reverse_iterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while(curNode != null){
            Node temp = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = temp;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverse_recursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverse_recursive(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }


    public void printList() {
        Node currNode = head;
  
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        
        Reverse_LL List = new Reverse_LL();
        List.addFirst(5);
        List.addLast(10);
        List.addLast(15);
        List.addFirst(0);
        List.printList();
        //List.reverse_iterate();
        List.head = List.reverse_recursive(List.head);
        List.printList();
    }
}
