package sort;

public class Quick {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pi = partition(arr, low, high);

        //sort left half
        sort(arr, low, pi);

        //sort right half
        sort(arr, pi + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = high - 1;
        while (i >= low) {
            if (arr[i] > pivot) {
                arr[i + 1] = arr[i];
            }
            i--;
        }

        arr[i + 1] = pivot;

        return i + 1;
    }
}
