package maang20;

//Leetcode:4
public class MediumOfSortedArray {
	public static void main(String[] args) {
		int arr1[]= {1,3};
		int arr2[]= {2};
		System.out.println(findMedianSortedArrays(arr1,arr2));
		
		// expected solution should be O(log(m+n))
	}
	
	// non optimized code TC=O(m+n) extra space O(n)
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n=nums1.length;
        int m=nums2.length;
        
        int combined[]=new int[n+m];
        int k=0,a1=0,b1=0;
        
        // combining them based on ascending order
        for(int i=0;i<n+m;i++) {
        	
        	if(a1<n && b1<m) {
        		if(nums1[a1]<nums2[b1]) {
            		combined[k++]=nums1[a1++];
            	}else {
            		combined[k++]=nums2[b1++];
            	}	
        	}
        }
        
        // adding left out values
        for(int i=a1;i<n;i++) {
        	combined[k++]=nums1[i];
        }
        
        for(int i=b1;i<m;i++) {
        	combined[k++]=nums2[i];
        }
        
        int mid =(m+n)/2;
    	
        double ans=0;
        if(combined.length==0) {
        	return ans;
        }
        
        // even
        if((n+m)%2==0) {
        	ans=(double)(combined[mid]+combined[mid-1])/2;
        }else {
        	// odd
        	ans=combined[mid];
        }
        
        return ans;
    }
	
	// optimized code TC=O(log(m+n))
	public static double finddMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int i=0,j=0,m1=0,m2=0;

        for(int count=0;count<=(n+m)/2;count++){
            m2=m1;
            if(i!=n && j!=m){
                if(nums1[i]>nums2[j]){
                    m1=nums2[j++];
                }else {
                    m1=nums1[i++];
                }
            }else if(i<n){
                m1=nums1[i++];
            }else{
                m1=nums2[j++];
            }
        }

        if((n+m)%2==1){
            return (double) m1;
        }else {
            double ans = (double) m1+ (double) m2;
            return ans/2.0;
        }
    }
}
