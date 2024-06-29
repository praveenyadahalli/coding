package linkedList;

import java.util.HashMap;

public class RemoveZeroSumConsecutiveNodes {

    public static void main(String[] args) {
//        Input: head = [1,2,-3,3,1]
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(-3);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(1);

        removeZeroSumSublists(head);
    }
    public static Node removeZeroSumSublists(Node head) {
        int prefixSum = 0;
        HashMap<Integer, Node> map = new HashMap<>();
        Node dummy = new Node(0);
        dummy.next = head;
        map.put(0, dummy);
        while (head != null) {
            prefixSum += head.data;
            if (map.containsKey(prefixSum)) {
                Node start = map.get(prefixSum);
                Node temp = start;
                int sum = prefixSum;
                while (temp != head) {
                    temp = temp.next;
                    sum += temp.data;
                    if (temp != head)
                        map.remove(sum);
                }
                start.next = head.next;
            } else {
                map.put(prefixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}
