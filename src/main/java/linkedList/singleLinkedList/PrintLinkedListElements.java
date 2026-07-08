package linkedList.singleLinkedList;

import linkedList.Node;

public class PrintLinkedListElements {
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
