package linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListOperation list = new LinkedListOperation();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        PrintLinkedListElements printLinkedListElements=new PrintLinkedListElements();
        System.out.println("Original linked list:");
        printLinkedListElements.printList(list.head);

        list.head = list.reverseList(list.head);
        System.out.println("\nReversed linked list:");
        printLinkedListElements.printList(list.head);
    }

}
