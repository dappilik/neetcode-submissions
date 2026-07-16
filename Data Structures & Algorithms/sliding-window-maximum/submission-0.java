class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max = new int[nums.length - k + 1];

        for (int i = 0; i < max.length; i++) {
            int windowMax = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                windowMax = Math.max(windowMax, nums[j]);
            }
            max[i]=windowMax;
        }
        return max;
    }
}
