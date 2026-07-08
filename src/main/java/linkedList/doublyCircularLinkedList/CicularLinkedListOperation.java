package linkedList.doublyCircularLinkedList;

import linkedList.NodeDLL;

public class CicularLinkedListOperation {
	public static void main(String[] args) {
		NodeDLL node1=new NodeDLL(1);
		NodeDLL node2=new NodeDLL(2);
		NodeDLL node3=new NodeDLL(3);
		
		node1.next = node2;
		node2.prev=node1;
		node2.next=node3;
		node3.prev=node2;
		
		// this is actually creating the circular linked list
		node3.next=node1; 
		node1.prev=node3;
		
		System.out.println("Forward Traversal");
		forwardTraversal(node1);
		
		System.out.println("Backward Traversal");
		backwardTraversal(node1);
	}
	
	public static void forwardTraversal(NodeDLL node) {
		NodeDLL temp=node;
		
		if(node!=null) {
			do {
				System.out.println(temp.data);
				temp=temp.next;
			}while(node!=temp);
		}
	}
	
	public static void backwardTraversal(NodeDLL node) {
		NodeDLL temp=node.prev;
		
		if(node!=null) {
			do {
				System.out.println(temp.data);
				temp=temp.prev;
			}while(node.prev!=temp);
		}
	}
}
