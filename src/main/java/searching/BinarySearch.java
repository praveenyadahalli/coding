package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(binSearch(3, arr));
    }
    public static boolean binSearch(int k,int arr[]){
        int l=0;
        int h=arr.length-1;
        boolean bool=false;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]<k){
                l=mid+1;
            }else if(arr[mid]>k){
                h=mid-1;
            }else if(arr[mid]==k){
                bool=true;
                break;
            }
        }
        return  bool;
    }
}