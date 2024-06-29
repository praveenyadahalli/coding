package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfArray {
    static void printSubsequence(int ind, List<Integer> list, int arr[], int n){
        if(ind==n){
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            return;
        }

        // take or pick the particular index into the subsequence
        list.add(arr[ind]);
        printSubsequence(ind+1,list,arr,n);
        list.remove(list.size()-1);

        // not pick, or not take condition, this element is not added to your subsequence
        printSubsequence(ind+1,list,arr,n);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> list=new ArrayList<>();
        printSubsequence(0,list,arr,arr.length);
    }
}
