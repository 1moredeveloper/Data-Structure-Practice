package sort;

public class Selection {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    public static void sort(int[] arr, int start, int end) {
        int lowest = Integer.MAX_VALUE;
        int lowestIndex = -1;
        for (int i = start; i < end; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
                lowestIndex = i;
            }
        }

        if (lowestIndex != -1) {
            arr[lowestIndex] = arr[start];
            arr[start] = lowest;

            sort(arr, start + 1, end);
        }
    }
}
