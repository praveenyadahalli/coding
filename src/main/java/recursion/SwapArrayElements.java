package recursion;

public class SwapArrayElements {

    static void reverse(int i,int arr[]){
        if(i>=arr.length/2){
            return ;
        }
        swap(i,arr.length-i-1,arr);
        reverse(i+1,arr);
    }

    static void reverse2(int i,int arr[],int n){
        if(i>=n/2){
            return ;
        }
        swap(i,n-i-1,arr);
        reverse2(i+1,arr,n);
    }
    static void swap(int i,int j,int arr[]){
        int k=arr[i];
        arr[i]=arr[j];
        arr[j]=k;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse2(0,arr,arr.length);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
