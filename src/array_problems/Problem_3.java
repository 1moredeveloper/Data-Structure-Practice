package array_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/*K’th Smallest/Largest Element in Unsorted Array | Set 1
Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the given array. It is given that ll array elements are distinct.

Examples:

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 4
Output: 10*/
public class Problem_3 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        Arrays.sort(arr);
        int k = 4;
        System.out.println(arr[k - 1]);
    }
}
