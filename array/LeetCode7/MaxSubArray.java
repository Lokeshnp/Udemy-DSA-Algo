package array.LeetCode7;

import java.util.Arrays;

public class MaxSubArray {

    public static int[] maxSubArray(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        int tempStart = 0;
        int start=0;
        int end = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>currentSum+nums[i]){
                currentSum =nums[i];
                tempStart =i;
            }else{
                currentSum +=nums[i];
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end =i;
            }
        }
       return Arrays.copyOfRange(nums, start, end+1);
    }

    public static void main(String[] args) {
        // Example 1: Simple case with positive and negative numbers
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result1 = maxSubArray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + Arrays.toString(result1));

        // Example 2: Case with a negative number in the middle
        int[] inputCase2 = {1, 2, 3, -4, 5, 6};
        int[] result2 = maxSubArray(inputCase2);
        System.out.println("Example 2: Input: " + Arrays.toString(inputCase2) + "\nResult: " + Arrays.toString(result2));

        // Example 3: Case with all negative numbers
        int[] inputCase3 = {-1, -2, -3, -4, -5};
        int[] result3 = maxSubArray(inputCase3);
        System.out.println("Example 3: Input: " + Arrays.toString(inputCase3) + "\nResult: " + Arrays.toString(result3));

        // Example 4: Case with all positive numbers
        int[] inputCase4 = {1, 2, 3, 4, 5};
        int[] result4 = maxSubArray(inputCase4);
        System.out.println("Example 4: Input: " + Arrays.toString(inputCase4) + "\nResult: " + Arrays.toString(result4));

        // Example 5: Case with alternating positive and negative numbers
        int[] inputCase5 = {1, -1, 1, -1, 1};
        int[] result5 = maxSubArray(inputCase5);
        System.out.println("Example 5: Input: " + Arrays.toString(inputCase5) + "\nResult: " + Arrays.toString(result5));

        /*
            EXPECTED OUTPUT:
            ----------------
            Example 1: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
            Result: 6
            Example 2: Input: [1, 2, 3, -4, 5, 6]
            Result: 13
            Example 3: Input: [-1, -2, -3, -4, -5]
            Result: -1
            Example 4: Input: [1, 2, 3, 4, 5]
            Result: 15
            Example 5: Input: [1, -1, 1, -1, 1]
            Result: 1
        */

    }
}
