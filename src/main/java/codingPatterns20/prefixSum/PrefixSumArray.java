package codingPatterns20.prefixSum;

public class PrefixSumArray {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		for(int i:preFixSum(arr)) {
			System.out.println(i);
		}
	}
	public static int[] preFixSum(int arr[]) {
		int n=arr.length;
		int[] prefixSum=new int[n];
		prefixSum[0]=arr[0];
		for(int i=1;i<n;i++) {
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		return prefixSum;
	}
	
}
