package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1, 2,5, 6, 4, 3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int val=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[val] > arr[j]) {
                    val=j;
                }
            }
            if(val!=i){
                swapElements(arr,i,val);
            }
        }
    }

    static void swapElements(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
