import java.util.LinkedList;


public class llJCF {

    // public static class Node{
    //     int data;
    //     Node next;

    //     public Node(int data){
    //         this.data=data;
    //         this.next=next;
    //     }
    // }

    // public static Node head;
    // public static Node tail;
    public static void main (String args[]){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(5);
        ll.add(1, 3);
         
        for(int num: ll){
        System.out.print(num + "->");
        }
        System.err.println("null");
    }
}
