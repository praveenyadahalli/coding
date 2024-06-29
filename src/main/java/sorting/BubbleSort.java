package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 4, 3};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swapElements(arr,i,j);
                }
            }
        }
    }

    static void swapElements(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
