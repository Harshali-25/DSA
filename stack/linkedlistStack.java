import java.util.LinkedList;

public class linkedlistStack {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    static class Stack{
        
        static Node head=null;

        //is empty ll
        public static boolean isEmpty(){
            return head==null;
        }

        //push data at top of ll
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return ;
            }
            newNode.next = head;
            head= newNode;
        }

        //pop data from top of ll
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            head= head.next;
            return top;
        }

        //peek data from top of ll
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            return top;
        }
    }

    public static void main(String args[]){
        Stack s= new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
