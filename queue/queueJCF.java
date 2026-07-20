import java.util.*;

public class queueJCF {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(7);
        q.add(2);
        q.add(9);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    };
}
