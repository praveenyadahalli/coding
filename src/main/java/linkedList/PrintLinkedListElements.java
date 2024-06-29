package linkedList;

public class PrintLinkedListElements {
     void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
