package maang20;

import java.lang.classfile.components.ClassPrinter.ListNode;

import linkedList.Node;
import java.util.*;

// leetcode: 23
public class MergeKLists {
	public static void main(String[] args) {
		Node l1=new Node(2);
		l1.next=new Node(4);
		l1.next.next=new Node(3);

		Node l2=new Node(5);
		l2.next=new Node(6);
		l2.next.next=new Node(4);
		
		Node l3=new Node(11);
		l3.next=new Node(14);
		l3.next.next=new Node(12);
		
		
		Node[] list = new Node[3];
		list[0]=l1;
		list[1]=l2;
		list[2]=l3;
		
		Node ans = mergeLists(list);
        
        while(ans!=null) {
        	System.out.println(ans.data);
        	ans=ans.next;
        }
	
	}
	
	// TC=O(n*k) SC=O(n)
	public static Node mergeLists(Node[] lists) {
		if(lists.length==0) {
			return null;
		}
		
		Node merged = lists[0];
		for(int i=1;i<lists.length;i++) {
			merged = mergeLists(merged,lists[i]);
		}
		
		return merged;
	}
	
	public static Node mergeLists(Node list1, Node list2) {
		Node dummy  = new Node(0);
		Node merged = dummy;
		
		while(list1!=null && list2!=null) {
			if(list1.data>list2.data) {
				merged.next = new Node(list2.data);
				list2=list2.next;
			}else {
				merged.next = new Node(list1.data);
				list1=list1.next;
			}
			
			merged=merged.next;
		}
		
		if(list1!=null) {
			merged.next=list1;
			merged=merged.next;
		}
		
		if(list2!=null) {
			merged.next=list2;
			merged=merged.next;
		}
		
		return dummy.next;
	}
}
