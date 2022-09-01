class ReverseThe Stack{

    public static void reverseTheStack(Stack<Integer> s){
        if(s.isEmpty()){
            
        }
        
        int top = s.pop();
        s.push();
    }

    public static void main(String args[]){

        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}