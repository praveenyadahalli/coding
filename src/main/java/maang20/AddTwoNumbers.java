package maang20;

import java.util.Arrays;
import java.util.LinkedList;

import linkedList.Node;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Node l1=new Node(2);
		l1.next=new Node(4);
		l1.next.next=new Node(3);

		Node l2=new Node(5);
		l2.next=new Node(6);
		l2.next.next=new Node(4);
		
		Node ans = addTwoNumbers(l1,l2);
        
        while(ans!=null) {
        	System.out.println(ans.data);
        	ans=ans.next;
        }
	}
	
	public static Node addTwoNumbers(Node l1,Node l2) {
		Node temp = new Node(0);
		Node curr = temp;
		int carry=0;
		
		while(l1!=null || l2!=null || carry!=0) {
			int sum=carry;
			
			if(l1!=null) {
				sum+=l1.data;
				l1=l1.next;
			}
			
			if(l2!=null) {
				sum+=l2.data;
				l2=l2.next;		
			}
			
			carry = sum/10;
			
			curr.next=new Node(sum%10);
			curr=curr.next;
		}
		
		return temp.next;
	}
}
