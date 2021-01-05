package array_problems;

/*Check if a key is present in every segment of size k in an array
Given an array arr[] and size of array is n and one another key x, and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].

Examples:

Input :
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3}
x = 3
k = 3
Output : Yes
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.

Input :
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}
x = 23
k = 5
Output :Yes
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}.
23 is present all window.

Input :arr[] = { 5, 8, 7, 12, 14, 3, 9}
x = 8
k = 2
Output : No*/
public class Problem_1 {
    public static void main(String[] args) {
        int[] arr = {21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25};

        boolean isPresent = true;
        int x = 23;
        int k = 5;

        for (int i = 0; i < arr.length; ) {
            if (i % k == 0 && !isPresent) {
                break;
            }
            if (arr[i] == x) {
                isPresent = true;
                i += (k - (i % k));
            } else {
                isPresent = false;
                i++;
            }
        }

        System.out.println(solution(arr, k, x) ? "YES" : "NO");
    }

    private static boolean solution(int[] arr, int k, int n) {
        // 0..4, 5..9, 10..14
        boolean isPresent = false;
        int l = arr.length;
        for (int i = 0; i < l;) {
            if (i != 0 && i % k == 0) {
                if (isPresent) {
                    isPresent = false;
                } else {
                    break;
                }
            }

            if (arr[i] == n) {
                isPresent = true;
                i = i + (k - (i % k));
            } else {
                i++;
            }
        }
        return isPresent;
    }
}
