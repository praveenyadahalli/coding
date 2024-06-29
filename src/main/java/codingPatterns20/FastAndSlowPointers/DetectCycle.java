package codingPatterns20.FastAndSlowPointers;


public class DetectCycle {
    public static void main(String[] args) {
        Node head=new Node(4);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(2);

        head.next.next.next.next = head.next.next; // This line creates the cycle

        System.out.println("Does the linked list have a cycle? " + hasCycle(head));
    }
    public static boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
            return true;
            }
        }
        return false;
    }
}
