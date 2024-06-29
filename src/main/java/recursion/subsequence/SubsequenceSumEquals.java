package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumEquals {
    public static void subsequenceSum(int ind, List<Integer> list, int s, int sum,int[] arr, int n) {
        if (ind == n) {

            if (s == sum) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }

        // include current element
        list.add(arr[ind]);
        s += arr[ind];
        subsequenceSum(ind + 1, list, s, sum,arr, n);

        //exclude current element
        s -= arr[ind];
        list.remove(list.size() - 1);
        subsequenceSum(ind + 1, list, s, sum,arr, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        List<Integer> list = new ArrayList<>();
        subsequenceSum(0, list, 0, 2,arr, arr.length);
    }
}
