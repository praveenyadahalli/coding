package linkedList.doubleLinkedList;

import linkedList.NodeDLL;

public class DoubleLinkedListOperation {
	public static void main(String[] args) {
		NodeDLL node1 = new NodeDLL(1);
		NodeDLL node2 = new NodeDLL(2);
		NodeDLL node3 = new NodeDLL(3);

		node1.next = node2;
		node2.prev = node1;
		node2.next = node3;
		node3.prev = node2;

		System.out.println("Travsersing forward way");
		traverseForward(node1);

		System.out.println("Travsersing backward way");
		traverseBackward(node3);

		// insert at front
//		NodeDLL node0 = new NodeDLL(0);
//		node0 = insertAtFront(node1, node0);
//		System.out.println("Printing after node insertion at front");
//		traverseForward(node0);

		// insert at end of list;
//		NodeDLL nodek = new NodeDLL(7);
//		nodek = insertAtEnd(node1, nodek);
//		System.out.println("Printing after node insertion at end");
//		traverseForward(nodek);
		
		// insert at middle of list;
		NodeDLL nodem = new NodeDLL(10);
		node1 = insertAtMiddle(node1, nodem);
		System.out.println("Printing after node insertion at middle");
		traverseForward(node1);
	}

	public static void traverseForward(NodeDLL head) {
		NodeDLL temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void traverseBackward(NodeDLL tail) {
		NodeDLL temp = tail;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}

	public static NodeDLL insertAtFront(NodeDLL head, NodeDLL freshNode) {
		freshNode.next = head.next;
		freshNode.prev = head;

		// think of like before insertion
		head.next.prev = freshNode;
		head.next = freshNode;

		return head;
	}

	public static NodeDLL insertAtEnd(NodeDLL head, NodeDLL freshNode) {
		NodeDLL temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = freshNode;
		freshNode.prev = temp;
		return head;
	}

	public static int getLengthOfDLL(NodeDLL head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static NodeDLL insertAtMiddle(NodeDLL head, NodeDLL freshNode) {
		NodeDLL temp = head;
		int len = getLengthOfDLL(temp)/2;
		temp = head;

		int count = 1;
		while (temp != null) {
			if (count == len) {
				freshNode.next = temp.next;
				freshNode.prev = temp;

				temp.next.prev = freshNode;
				temp.next = freshNode;
				break;
			} else {
				temp = temp.next;
				count++;
			}

		}
		return head;
	}

}
