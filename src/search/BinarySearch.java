package search;

public class BinarySearch {
    public static int search(int[] array, int x) {
        return search(array, 0, array.length, x);
    }

    public static int search(int[] array, int start, int end, int x) {
        if (start > end) return -1;

        int mid = (end + start) / 2;

        if (array[mid] == x){
            return mid;
        } else if (array[mid] > x) {
            return search(array, start, mid - 1, x);
        } else {
            return search(array, mid + 1, end, x);
        }
    }
}
