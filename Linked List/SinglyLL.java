class SinglyLL {

    Node head;
    private int size;

    SinglyLL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
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

    public void deletefirst(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    public void deletelast(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node LastNode = head;
        while(LastNode.next != null){
            secondLast = LastNode;
            LastNode = LastNode.next;
        }
        secondLast.next = null;
    }


    public void printList() {
        Node currNode = head;
  
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        
        SinglyLL List = new SinglyLL();
        List.addFirst(5);
        List.addLast(10);
        List.addLast(15);
        List.addFirst(0);
        List.deletefirst();
        List.deletelast();
        List.printList(); 
        System.out.println(List.getSize()); 
    }
}
