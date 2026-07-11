package topic12_heaps_sorting;


import java.util.PriorityQueue;

/**
 * Example: Find the Kth Largest Element in a Stream
 */
public class Example {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public Example(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
