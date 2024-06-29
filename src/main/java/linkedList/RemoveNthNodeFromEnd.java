package linkedList;

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
        Node curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int nFromStart=len-n+1;
        if(nFromStart==1) return head.next;
        curr=head;
        while(--nFromStart>1){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
