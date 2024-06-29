package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
    public static void main(String[] args) {

        //create linkedlist and add elements to it
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //Create a list to store all the elements of linked list
        List<Integer>list=new ArrayList<>();

        // Corrected loop to iterate over linkedList, not list
        for(Integer i:linkedList){
            list.add(i);
        }

        //printing elements of list one by one
        for(int i:list){
            System.out.println(i);
        }
    }
}
