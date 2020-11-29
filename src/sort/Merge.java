package sort;

public class Merge {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length -1);
    }

    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        //sort left half
        sort(arr, start, mid);

        //sort right half
        sort(arr, mid + 1, end);

        //merge
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // create two arrays
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            arr1[i] = arr[start + i];
        for (int j = 0; j < n2; ++j)
            arr2[j] = arr[mid + 1 + j];

        // merge
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
// Initial index of merged subarry array
        int k = start;
        while (i < n1 && j < n2) {
            arr[k++] = arr1[i] <= arr2[j] ? arr1[i++] : arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        // Store remaining elements of second array
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }
}
