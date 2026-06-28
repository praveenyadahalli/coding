import java.util.*;

public class Test2 {
	public static void main(String args[]) {
		int arr[] = { 1,2};
//		minimumSwaps(arr);
//		rotateByKPosition(arr, 2);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		rotate(arr,0);
	}
	
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] leftArr=new int[n];
        int[] rightArr=new int[n];

        int l=0,r=0;
        for (int i = n-k; i < n; i++) {
            rightArr[l++]=nums[i];
        }

        for (int i = l; i <=k ; i++) {
        	rightArr[l++]=nums[i];
        }
    
        nums=rightArr.clone();
        System.out.println();
    }

	public static void rotateByKPosition(int[] arr, int pos) {
		int n = arr.length;
		int k = pos % n;

		// reverse from 0 to k
		reverseArray(arr, 0, k - 1);
		// reverse from k to n
		reverseArray(arr, k, n - 1);
		// reserver entire array
		reverseArray(arr, 0, n - 1);
	}

	public static void reverseArray(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static int minimumSwaps(int[] nums) {
		int zeros = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				zeros++;
			}
		}
		int k = 0;
		for (int i = n - 1; i >= zeros; i--) {
			if (nums[i] != 0) {
				k++;
			}
		}

		return k;
	}
	
}
