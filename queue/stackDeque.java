import java.util.Deque;
import java.util.LinkedList;

public class stackDeque {

    static class Stack{
    static Deque<Integer> deque= new LinkedList<>();


    //push
    public static void push(int data){
        deque.addLast(data);
    }

    //pop
    public static int pop(){
        return deque.removeLast();
    }

    //peek
    public static int peek(){
        return deque.getLast();
    }
}

    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek= "+ s.peek());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
    }
    
}
