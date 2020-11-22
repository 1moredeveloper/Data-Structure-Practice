package sort;

public class Bubble {
    public static void sort(int[] arr) {
        sort(arr, arr.length);
    }

    public static void sort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < (n - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
