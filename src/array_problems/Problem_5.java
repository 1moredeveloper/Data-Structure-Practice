package array_problems;

import java.util.Arrays;

/*Move all negative numbers to beginning and positive to end with constant extra space
An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples :

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/
public class Problem_5 {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        // Loop to iterate over the
        // array from left to the right
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            }
            // Condition to check if the left
            // pointer element is positive and
            // the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            // Condition to check if both the
            // elements are positive
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
