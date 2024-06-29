package linkedList;

public class MiddelOfLinkedList {
    public static void main(String[] args) {
        Node head=new Node(4);
        head.next=new Node(2);
        head.next.next=new Node(5);
        System.out.print(middleNode(head).data + " ");
    }
    public static Node middleNode(Node head) {
        if(head==null || head.next==null){
            return head;
        }

        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
