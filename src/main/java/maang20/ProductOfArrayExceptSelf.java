package maang20;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int index=2;
		int[] arr= {1,2,3,4};
		for(int val:productExceptSelf(arr)) {
			System.out.println(val);			
		}

	}
	
	// SC=O(2n)=O(n) TC=O(n)
	public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefixProduct[]=new int[n];
        int suffixProduct[]=new int[n];

        int prod=1;
        for(int i=0;i<n;i++){
        	prod*=nums[i];
            prefixProduct[i]=prod;
        }

        prod=1;
        for(int i=n-1;i>=0;i--){
        	prod*=nums[i];
        	suffixProduct[i]=prod;
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i] = suffixProduct[i+1];
            }
            if(i==n-1){
                nums[i] = prefixProduct[i-1];
            }
            if(i!=0 && i!=n-1){
                nums[i] = prefixProduct[i-1]*suffixProduct[i+1];
            }
        }

        return nums;
    }
}
