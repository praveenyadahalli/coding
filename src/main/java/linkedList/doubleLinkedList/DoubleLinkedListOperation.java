package linkedList.doubleLinkedList;

import linkedList.NodeDLL;

public class DoubleLinkedListOperation {
	public static void main(String[] args) {
		NodeDLL node1=new NodeDLL(1);
		NodeDLL node2=new NodeDLL(2);
		NodeDLL node3=new NodeDLL(3);
		
		node1.next = node2;
		node2.prev=node1;
		node2.next=node3;
		node3.prev=node2;
		
		System.out.println("Travsersing forward way");		
		traverseForward(node1);
		
		System.out.println("Travsersing backward way");
		traverseBackward(node3);
	}
	
	public static void traverseForward(NodeDLL head) {
		NodeDLL temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void traverseBackward(NodeDLL tail) {
		NodeDLL temp = tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
}
