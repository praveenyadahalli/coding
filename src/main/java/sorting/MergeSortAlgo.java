package sorting;

/*
 * Time Complexity - O(nlogn)
 * Space Complexity - O(n)
 */
public class MergeSortAlgo {
	static void mergeSort(int arr[], int low, int high) {

		// base condition
		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;

		// sort the elements below mid;
		mergeSort(arr, low, mid);

		// sort the elements after mid;
		mergeSort(arr, mid + 1, high);

		// merge sorted array
		mergeArray(arr, low, mid, high);
	}

	private static void mergeArray(int[] arr, int low, int mid, int high) {
		
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		// copy all elements to new left array
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[low + i];
		}

		// copy all elements to new right array
		for (int i = 0; i < n2; i++) {
			rightArray[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = low;

		// place these left, right array elements into the array
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// place all the remaining elements of left array into array, if present
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// place all the remaining elements of right array into array, if present
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 4, 8, 5 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}
}
