package array_problems;

/*Program to cyclically rotate an array by one
Given an array, cyclically rotate the array clockwise by one.

Examples:

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}*/

public class Problem_6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
    }
}
