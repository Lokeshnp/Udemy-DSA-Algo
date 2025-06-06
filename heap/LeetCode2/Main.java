package heap.LeetCode2;

import static heap.LeetCode2.Solution.findKthLargest;

public class Main {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println("Test case 1:");
        System.out.println("Expected output: 10");
        System.out.println("Actual output: " + findKthLargest(nums1, k1));
        System.out.println();

        // Test case 2
        int[] nums2 = {2, 1, 3, 5, 6, 4};
        int k2 = 2;
        System.out.println("Test case 2:");
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " +findKthLargest(nums2, k2));
        System.out.println();

        // Test case 3
        int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
        int k3 = 5;
        System.out.println("Test case 3:");
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + findKthLargest(nums3, k3));
        System.out.println();


        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1:
            Expected output: 10
            Actual output: 10

            Test case 2:
            Expected output: 5
            Actual output: 5

            Test case 3:
            Expected output: 5
            Actual output: 5

        */

    }
}
