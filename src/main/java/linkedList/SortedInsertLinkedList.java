package linkedList;

import java.util.LinkedList;

public class SortedInsertLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        Node node=new Node(25);
        node.next=new Node(36);
        node.next.next=new Node(40);
        node.next.next.next=new Node(45);
        Node ans=sortedInsert(node,37);
        while(ans!=null){
            System.out.println(ans.data);
            ans=ans.next;
        }
    }
    static Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node fresh=new Node(key);
        if(head1.data>key){
            fresh.next=head1;
            head1=fresh;
            return head1;
        }
        Node temp=head1;
        Node last=null;
        while(temp!=null&&temp.data<=key){
            last=temp;
            temp=temp.next;
        }
        last.next=fresh;
        fresh.next=temp;

        return head1;
    }
}
