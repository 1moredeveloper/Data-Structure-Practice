package array_problems;
/*Find duplicates in array*/

public class Problem_9 {
    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 1, 3, 6, 6};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                System.out.print(i + " ");
            }
        }
    }
}
