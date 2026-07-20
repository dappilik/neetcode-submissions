class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<int[]> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < heights.length; right++) {
            int left = right;

            while (!stack.isEmpty() && stack.peek()[1] > heights[right]) {
                max = Math.max((right - stack.peek()[0]) * stack.peek()[1], max);
                left = Math.min(left, stack.peek()[0]);
                stack.pop();
            }

            stack.push(new int[] {left, heights[right]});
        }

        while (!stack.isEmpty()) {
            max = Math.max((heights.length - stack.peek()[0]) * stack.peek()[1], max);
            stack.pop();
        }
        return max;
    }
}
