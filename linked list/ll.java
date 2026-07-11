import java.util.*;
public class ll{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;



//add first
    public void addfirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }



//add middle
    public void addmiddle(int idx, int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp= head;
        int i=0;

        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next= newNode;

    }




//add last

public void addlast(int data){
     Node newNode= new Node(data);
     size++;
     if(head==null){
        head=tail=newNode;
        return;
     }
     tail.next=newNode;
     tail=newNode;
}



//remove element from  first
public int removefirst(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        head=head.next;
        size=0;
        return val;
    }
    int val=head.data;
    head= head.next;
    size--;
    return val;
}




//remove element from last
public int removelast(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }

    Node prev=head;
    for(int i=0; i<size-2; i++){
        prev=prev.next;
    }
    int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
    return val;

}




//iterative search
public int iterativesearch(int key){
    Node temp= head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
}




//search recursive
public int helper(Node head, int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx= helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}

public int recsearch(int key){
    return helper(head, key);
}



//reverse ll
public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

    while (curr!= null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}



//remove node from end
public void deleteNthfromEnd (int n){
    int sz=0;
    Node temp=head;
    while (temp!=null) {
        temp=temp.next;
        sz++;
    }
    if(n==size){//remove first node
        head=head.next;
        return;
    }

    int i=1;
    int itofind=sz-n;
    Node prev=head;
    while(i < itofind){
        prev=prev.next;
        i++;
    }
    prev.next= prev.next.next;
    return;
}



//print ll

public void print(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp= head;
    while(temp!=null){
        System.out.print(temp.data+ "=>");
        temp=temp.next;
    }
    System.out.println("null");
}


//find mid slow fast approch or tortoise hare approach
public Node findmid(Node head){
    Node slow= head;
    Node fast= head;


    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

public boolean isPalindrome(){
    if(head==null || head.next==null){
        return true;
    }

    //find mid
    Node mid=findmid(head);

    // reverse 2nd half
    Node prev=null;
    Node curr=mid;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    Node right=prev;
    Node left=head;


    // check is 1st half and 2nd half is equal or not
    while(right!=null){
        if(left.data!=right.data){
            return false; 
        }
        left=left.next;
        right=right.next;
    }
    return true;
}

//detect cycle ll
public static boolean iscycle(){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            return true;
        }
    }
    return false;
}



//remove a cycle/loop in a ll
public static void removecycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        
        if(slow==fast){
            cycle=true;
            break;
        }
    }
    if(cycle==false){
        return;
    }

    //find meeting point
slow=head;
Node prev=null;
while(slow!=fast){
    slow=slow.next;
    prev=fast;
    fast=fast.next;
}
    //remove cycle->last node
    prev.next=null;
}


//get mid from first half
public Node getmid(Node head){
    Node slow=head;
    Node fast=head.next;

    while(fast!=null && fast.next!= null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

public Node merge(Node lefthead, Node righthead){
    Node mergedll =new Node(-1);
    Node temp=mergedll;

    while(lefthead!=null && righthead!=null){
        if(lefthead.data<=righthead.data){
            temp.next=lefthead;
            lefthead=lefthead.next;
            temp=temp.next;
        }else{
            temp.next=righthead;
            righthead=righthead.next;
            temp=temp.next;
        }
    }
        while(lefthead!=null){
            temp.next=lefthead;
            lefthead=lefthead.next;
            temp=temp.next;
        }

        while(righthead!=null){
            temp.next=righthead;
            righthead=righthead.next;
            temp=temp.next;
        }
        return mergedll.next;
}

public Node mergesort(Node head){

    if(head==null || head.next==null){
        return head;
    }

    Node mid=getmid(head);

    Node righthead=mid.next;
    mid.next=null;

    Node newleft=mergesort(head);
    Node newright= mergesort(righthead);

    return merge(newleft, newright);

}

//zig zag ll
public void zigzag(){
    //find mid from first half
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }

    Node mid= slow;

    //reverse second half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;

    //alternate merging 
    Node nextL, nextR;
    while(left!=null && right!=null){
        nextL=left.next;
        left.next= right;
        nextR= right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;
    }
    
}
    public static void main(String args[]){
        ll myll= new ll();

        // myll.addfirst(2);
        // myll.addfirst(1);
        // myll.addlast(3);
        // myll.addlast(4);
        // myll.addlast(5);
        // myll.addmiddle(2, 9);

        // myll.print();
        // System.out.println(myll.size);
        // myll.removefirst();
        // myll.print();
        // myll.removelast();
        // myll.print();
        // System.out.println(myll.size);

        // System.out.println(myll.recsearch(3));
        // System.out.println(myll.recsearch(10));

        // myll.reverse();
        // myll.print();
        // myll.deleteNthfromEnd(3);
        // myll.print();


        // myll.addlast(1);
        // myll.addlast(2);
        // myll.addlast(2);
        // myll.addlast(1);
        // myll.print();
        // System.out.println(myll.isPalindrome());


        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=new Node(4);
        // head.next.next.next.next=head.next;
        // System.out.println();
        // System.out.println(iscycle());
        // removecycle();
        // System.out.println(iscycle());

        // 
        
        myll.addlast(1);
        myll.addlast(2);
        myll.addlast(3);
        myll.addlast(4);
        myll.addlast(5);
        myll.print();
        myll.zigzag();
        myll.print();
    }
}