package sorting;

public class MergeSortAlgo {
    static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeArray(arr,low,mid,high);
    }

    private static void mergeArray(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int leftArray[]=new int[n1];
        int rightArray[]=new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            rightArray[i]=arr[mid+1+i];
        }

        int i=0,j=0, k=low;

        while (i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4,8,5};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}
