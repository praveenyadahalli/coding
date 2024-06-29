package codingPatterns20.TwoPointers;

/*Finding a pair of numbers that add up to a
  target sum in a sorted or unsorted array*/

import java.util.ArrayList;
import java.util.List;

public class PairsOfNumbersSortedArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int k=10;
        List<int[]>pairs=pairsSum(arr,k);
        for(int pair[]:pairs){
            System.out.println(pair[0]+" "+pair[1]);
        }
    }

    public static List<int[]> pairsSum(int arr[], int k){
        int l=0,r=arr.length-1;
        List<int[]>list=new ArrayList<>();
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==k){
                list.add(new int[]{arr[l],arr[r]});
                l++;r--;
            }else if(sum<k){
                l++;
            }else{
                r--;
            }
        }
        return list;
    }
}
