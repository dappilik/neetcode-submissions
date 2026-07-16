class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int index =0;
        for(int right =0; right<nums.length; right++){
            //remove outside window
            // 0 1 2 3 4
            while(!deque.isEmpty() && deque.peekFirst() <= right-k){
                deque.pollFirst();
            }

            //remove smaller Ones
            // current 4
            // [2 3] ==> [1 0]
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[right]){
                deque.pollLast();
            }

            // Add current
            deque.offerLast(right);

            //if window reached, take first from queue
            if(right >= k-1){
                max[index++]=nums[deque.peekFirst()];
            }
        }
        
        return max;
    }
}
