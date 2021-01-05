package array_problems;

import java.util.Arrays;

/*Write a program to reverse an array or string

Given an array (or string), the task is to reverse the array/string.
Examples :


Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}*/
public class Problem_2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        int temp;
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
