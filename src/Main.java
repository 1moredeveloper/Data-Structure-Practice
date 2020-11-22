import sort.Bubble;
import sort.Merge;
import sort.Selection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, 2, 4, 9, 5, 2, 1, 0, 9, -7};

//        int search = BinarySearch.search(arr, -4);
//        System.out.println("Searched position = " + search);

//        Bubble.sort(arr, 4);
//        System.out.println("Sorted array = " + Arrays.toString(arr));

//        Selection.sort(arr);
//        System.out.println("Sorted array = " + Arrays.toString(arr));

        Merge.sort(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));
    }
}
