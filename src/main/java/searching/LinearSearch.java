package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(linSearch(3, arr));
    }

    public static boolean linSearch(int k, int arr[]) {
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                bool = true;
                return bool;
            }
        }
        return bool;
    }
}
