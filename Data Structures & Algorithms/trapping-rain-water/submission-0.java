class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int maxLeft = 0;
        int maxRight = 0;
        while (left < right) {
            // System.out.println("------ " + left + ", " + right);
            // System.out.println("maxLeft " + maxLeft + " result " + result);
            maxLeft = Math.max(maxLeft, height[left]);
            // System.out.println("maxLeft " + maxLeft + " result " + result);
            result = result + maxLeft - height[left];
            // System.out.println("maxRight " + maxRight + " result " + result);
            maxRight = Math.max(maxRight, height[right]);
            // System.out.println("maxRight " + maxRight + " result " + result);
            result = result + maxRight - height[right];
            // System.out.println("maxRight " + maxRight + " result " + result);
            if (maxLeft > maxRight) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
