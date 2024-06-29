package codingPatterns20.TwoPointers;

import java.util.HashSet;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0;
        int l=0;
        int r=0;
        int maxSum=nums[0];
        while(l<nums.length-1 && r<nums.length){
            int leftVal=nums[l];
            int rightVal=nums[r];
            if(rightVal>sum+rightVal){
                l=r;
                sum=rightVal;
            }else{
                sum+=rightVal;
            }
            maxSum=Math.max(sum,maxSum);
            r++;
        }
        return maxSum;
    }
}
