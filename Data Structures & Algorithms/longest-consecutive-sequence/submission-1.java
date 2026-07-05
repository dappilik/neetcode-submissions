class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            if (!set.contains(nums[i] - 1)) {
                temp = 1;
                int seq = nums[i];
                while (set.contains(seq + 1)) {
                    temp++;
                    seq++;
                }
                if (result < temp) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
