import sort.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, 2, 4, 9, 5, 2, 1, 0, 9, -7};

        Quick.sort(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));
    }
}
