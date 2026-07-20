import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class deque {
     public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.print(deque);
        deque.removeFirst();
        System.out.print(deque);
        deque.removeLast();
        System.out.print(deque);

        System.out.print("First element: " +deque.getFirst());
        System.out.print("Last element: " +deque.getLast());

    }
}
