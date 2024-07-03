package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements from ArrayList to LinkedList .addall method accepts arraylist 
        linkedList.addAll(arrayList);

        // Print the LinkedList
        for (int i : linkedList) {
            System.out.println(i);
        }
    }
}

