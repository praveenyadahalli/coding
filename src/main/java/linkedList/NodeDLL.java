package linkedList;

public class NodeDLL {
	public int data;
	public NodeDLL next;
	public NodeDLL prev;

	public NodeDLL(int d,NodeDLL prev,NodeDLL next) {
		data = d;
		next = null;
		prev = null;
	}
	
	public NodeDLL() {
		
	}

	public NodeDLL(int i) {
		this.data=i;
		this.next=null;
		this.prev=null;
	}
}
