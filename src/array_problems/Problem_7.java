package array_problems;

/*Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
Example:

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number from 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number from 1 to 5 is 4*/

public class Problem_7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int sum = 0;
        int n = 8;
        for (int j : arr) {
            sum += j;
        }
        int actualSum = (n * (n + 1)) / 2;
        System.out.println(actualSum - sum);
    }
}
