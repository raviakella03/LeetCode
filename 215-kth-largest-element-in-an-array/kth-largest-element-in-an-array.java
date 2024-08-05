class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // For max heap
                return b - a;
            }
        });
        
        for(int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        for(int i = 1; i < k; i++) {
            pq.poll();
        }
        return pq.poll();
    }
}