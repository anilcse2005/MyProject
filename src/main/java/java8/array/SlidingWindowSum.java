package java8.array;

public class SlidingWindowSum {

    public static int[] slidingSum(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];

        // Build a prefix sum array for efficient range sum queries
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (i < k - 1) {
                // Growing window: sum from index 0 to i
                result[i] = prefix[i + 1];
            } else {
                // Full window: sum of k elements ending at index i
                result[i] = prefix[i + 1] - prefix[i + 1 - k];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,8,6,4};
        int k = 3;

        int[] result = slidingSum(arr, k);

        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        // Output: 1, 3, 6, 9, 12, 15
    }
}
