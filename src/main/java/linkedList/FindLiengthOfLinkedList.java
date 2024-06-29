package linkedList;

public class FindLiengthOfLinkedList {
        public static void main(String[] args) {
            LinkedListOperation linkedListOperation =new LinkedListOperation();
            linkedListOperation.push(1);
            linkedListOperation.push(2);
            linkedListOperation.push(3);
            linkedListOperation.push(4);
            System.out.println("Length of Linked List is "+ linkedListOperation.getCount());
            System.out.println("Check the elment in the list "+ linkedListOperation.search(10));
        }
}

