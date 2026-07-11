class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int maxLeft = 0;
        int maxRight = 0;
        while (left < right) {
            maxLeft = Math.max(maxLeft, height[left]);
            result = result + maxLeft - height[left];
            maxRight = Math.max(maxRight, height[right]);
            result = result + maxRight - height[right];
            if (maxLeft > maxRight) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
