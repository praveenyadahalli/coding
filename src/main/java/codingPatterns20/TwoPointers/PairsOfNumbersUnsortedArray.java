package codingPatterns20.TwoPointers;

import java.util.*;

public class PairsOfNumbersUnsortedArray {
    public static void main(String[] args) {
        int arr[]={3,5,2,8,11};
        int k=10;
        for (int[] pair:unsortedPairs(arr,k)){
            System.out.println(pair[0]+" "+pair[1]);
        }
    }
    public static List<int[]> unsortedPairs(int arr[],int k){
        List<int[]> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment=k-arr[i];
            if(map.containsKey(compliment)){
                list.add(new int[]{arr[i],compliment});
            }
            map.put(arr[i],compliment);
        }
        return list;
    }
}
