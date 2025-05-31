package heap.LeetCode2;

import java.util.PriorityQueue;

class Solution {
    public static int findKthLargest(int[] nums, int k) {
        // Min-heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest element
            }
        }

        // Top of the heap is the kth largest
        return minHeap.peek();
    }
}