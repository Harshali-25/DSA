import java.util.*;

public class palindrome_ll {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static boolean palindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        Node temp = head;
        Stack<Integer> s = new Stack<>();

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            int stackvalue = s.pop();

            if (stackvalue != temp.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(palindrome());
    }
}
