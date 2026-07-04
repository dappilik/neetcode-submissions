class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] forward = new int[nums.length];
        int[] reverse = new int[nums.length];
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++) {
            if (i == 0) {
                forward[i] = 1;
            } else {
                forward[i] = forward[i - 1] * nums[i - 1];
            }
            if (j == nums.length - 1) {
                reverse[j] = 1;
            } else {
                reverse[j] = reverse[j + 1] * nums[j + 1];
            }
            j--;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = forward[i] * reverse[i];
        }

        return result;
    }
}
