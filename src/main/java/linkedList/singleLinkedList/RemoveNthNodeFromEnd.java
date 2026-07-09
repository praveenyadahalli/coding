package linkedList.singleLinkedList;

import linkedList.Node;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        removeNthFromEnd(head,2);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node removeNthFromEnd(Node head, int n) {
        Node temp=head;
        int listLength=getListLength(head);
        
        int nFromBegin = listLength-n+1;
        if(nFromBegin==1) {
        	return head.next;
        }
        
        int count=1;
        while(temp!=null && temp.next!=null) {
        	if(count+1==nFromBegin) {
        		temp.next=temp.next.next;
        		break;
        	}else {
        		temp=temp.next;
        	}
        	count++;
        }
        return head;
    }
    
    public static int getListLength(Node head) {
    	int count=0;
    	while(head!=null) {
    		count++;
    		head=head.next;
    	}
    	return count;
    }
}
