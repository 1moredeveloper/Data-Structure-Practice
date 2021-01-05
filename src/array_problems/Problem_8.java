package array_problems;

/*Count pairs with given sum
Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.

Examples:

Input  :  arr[] = {1, 5, 7, -1},
          sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1)

Input  :  arr[] = {1, 5, 7, -1, 5},
          sum = 6
Output :  3
Pairs with sum 6 are (1, 5), (7, -1) &
                     (1, 5)

Input  :  arr[] = {1, 1, 1, 1},
          sum = 2
Output :  6
There are 3! pairs with sum 2.

Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6,
                   5, 4, 2, 1, 1, 1},
          sum = 11
Output :  9*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem_8 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int sum = 11;
        Set<Integer> set = new HashSet<>();
        for (int e : arr) {
            set.add(e);
        }
        int i = 0;
        for (int e : arr) {
            if (set.contains(sum - e)) {
                i++;
            }
        }
        System.out.println(i);
    }
}
