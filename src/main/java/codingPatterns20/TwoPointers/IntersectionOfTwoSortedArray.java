package codingPatterns20.TwoPointers;

import java.util.ArrayList;

public class  IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,5,7,8};
        for(int i:intersectionTwoArrays(arr1,arr2)){
            System.out.print(i+" ");
        }

    }
    public static ArrayList<Integer> intersectionTwoArrays(int arr1[], int arr2[]){
        int i=0,j=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;j++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                i++;
            }
        }
        return  list;

    }
}
