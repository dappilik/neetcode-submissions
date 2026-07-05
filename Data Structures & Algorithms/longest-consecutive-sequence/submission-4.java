class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentLength = 1;
                while (set.contains(num + currentLength)) {
                    currentLength++;
                }
                result = Math.max(result, currentLength);
            }
        }
        return result;
    }
}
