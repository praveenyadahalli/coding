package linkedList.singleLinkedList;

import linkedList.Node;

public class LinkedListOperation {
    public Node head;
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public int getCount(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return  count;
    }

    public boolean search(int x){
        while (head!=null){
            if(head.data==x){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    // tc=O(n) sc=O(1)
    public Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link

            // Move pointers one position ahead
            prev = current;
            current = next;
        }

        // The new head of the reversed list is the previous pointer
        return prev;
    }
}